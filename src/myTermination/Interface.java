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
import myTermination.MyTermination.statechans.I1.MyTermination_I1_1_Future;
import myTermination.MyTermination.statechans.I2.MyTermination_I2_1;

public class Interface {
	public static void main(String[] args) throws Exception {

		try (ScribServerSocket s1 = new SocketChannelServer(8888);
				ScribServerSocket s2 = new SocketChannelServer(7777)) {
			try (MPSTEndpoint<MyTermination, I1> interface1 = new MPSTEndpoint<>(new MyTermination(), I1,
					new ObjectStreamFormatter());
					MPSTEndpoint<MyTermination, I2> interface2 = new MPSTEndpoint<>(new MyTermination(), I2,
							new ObjectStreamFormatter())) {

				interface1.accept(s1, M); // 接続を許可する
				interface2.accept(s2, T);

				var i = new MyTermination_I1_1(interface1); // 初期状態の生成
				var j = new MyTermination_I2_1(interface2);

				var buf = new Buf<MyTermination_I1_1_Future>();	// Futureクラスのバッファオブジェクトを生成
				i.async(M, shutdownRequest, buf); // 非同期メソッドを用いて次の状態のオブジェクトを生成
				runAsync(() -> buf.val.sync());

				while (true) {
					var j2 = j.receive(T, isShutdownRequested); // choice at M に対応
					if(buf.val.isDone()) {
						j2.send(T, True);
						break;
					} else {
						j = j2.send(T, False);
					}
				}
				System.out.println("Interface: True sent");

			} catch (ScribRuntimeException | IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}

		}
	}

	public static interface RunnableWithIOException {
		public void run() throws IOException;
	}

	public static void runAsync(RunnableWithIOException r) {
		new Thread(() -> {
			try {
				r.run();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}).start();
	}
}