package myTermination;

import static myTermination.MyTermination.MyTermination.*;

import java.io.IOException;

import org.scribble.main.ScribRuntimeException;
import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.ScribServerSocket;
import org.scribble.runtime.net.SocketChannelServer;
import org.scribble.runtime.session.MPSTEndpoint;
import org.scribble.runtime.util.Buf;

import myTermination.MyTermination.MyTermination;
import myTermination.MyTermination.roles.I1;
import myTermination.MyTermination.roles.I2;
import myTermination.MyTermination.statechans.I1.MyTermination_I1_1;
import myTermination.MyTermination.statechans.I1.MyTermination_I1_1_Cases;
import myTermination.MyTermination.statechans.I2.MyTermination_I2_1;
import myTermination.MyTermination.statechans.I2.MyTermination_I2_1_Future;
import myTermination.MyTermination.statechans.I2.MyTermination_I2_2;

public class Interface {

	public static void main(String[] args) throws Exception {


		try (ScribServerSocket s1 = new SocketChannelServer(8888);
				ScribServerSocket s2 = new SocketChannelServer(7777)) {
			try (MPSTEndpoint<MyTermination, I1> interface1 = new MPSTEndpoint<>(new MyTermination(), I1,
					new ObjectStreamFormatter());
					MPSTEndpoint<MyTermination, I2> interface2 = new MPSTEndpoint<>(new MyTermination(), I2,
							new ObjectStreamFormatter())) {

				interface1.accept(s1, M);
				interface2.accept(s2, T);

				MyTermination_I1_1 i = new MyTermination_I1_1(interface1);
				MyTermination_I2_1 j = new MyTermination_I2_1(interface2);

				var buf = new Buf<MyTermination_I2_1_Future>();
				MyTermination_I2_2 j2 = j.async(T, isShutdownRequested, buf);
				//MyTermination_I2_2 j2 = j.receive(T, isShutdownRequested, __);

				Exit:
				while (true) {
					System.out.println("Interface: step");
					new Thread(new Runnable() { public void run() {
							try {
								buf.val.sync();
							} catch(IOException e) {
								e.printStackTrace();
							}
						}}).start();
					if (buf.val.isDone()) { // isShutdownRequested が来てたら
						System.out.println("Interface: isShutdownRequested received");
						j = j2.send(T, False);
						j2 = j.async(T, isShutdownRequested, buf);
					}

					MyTermination_I1_1_Cases cases = i.branch(M);
					switch (cases.op) {
					case go:
						i = cases.receive(M, go);
						break;
					case shutdownRequest:
						cases.receive(M, shutdownRequest);
						break Exit;
					}
				}

				buf.val.sync();
				j2.send(T, True);


				//    			    if(i.receive(M, shutdownRequest) != null) {
				//    			    	flag = true;
				//    			    }

//				if (flag) {
//					j2.send(T, True);
//					flag = false;
//				} else {
//					j = j2.send(T, False);
//				}
			} catch (ScribRuntimeException | IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}

		}
	}
}
