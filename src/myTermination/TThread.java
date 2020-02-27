package myTermination;

import static myTermination.MyTermination.MyTermination.*;

import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.ScribServerSocket;
import org.scribble.runtime.net.SocketChannelEndpoint;
import org.scribble.runtime.net.SocketChannelServer;
import org.scribble.runtime.session.MPSTEndpoint;

import myTermination.MyTermination.MyTermination;
import myTermination.MyTermination.roles.T;
import myTermination.MyTermination.statechans.T.MyTermination_T_1;
import myTermination.MyTermination.statechans.T.MyTermination_T_2;
import myTermination.MyTermination.statechans.T.MyTermination_T_3;
import myTermination.MyTermination.statechans.T.MyTermination_T_3_Cases;

public class TThread {

	public static void main(String[] args) throws Exception {
		MyTermination termination = new MyTermination();
		try (MPSTEndpoint<MyTermination, T> thread = new MPSTEndpoint<>(termination, T, new ObjectStreamFormatter());
				ScribServerSocket th = new SocketChannelServer(6666)) {
			thread.request(I2, SocketChannelEndpoint::new, "localhost", 7777);
			thread.accept(th, M);
			System.out.println("fib answer = " + fib(new MyTermination_T_1(thread)));
		}
	}

	private static int fib(MyTermination_T_1 t1) throws Exception {
		int x = 0;
		int y = 1;
		int z = 0;

		MyTermination_T_2 t2 = t1.receive(M, start);

		Exit:
		while (true) {
			MyTermination_T_3 t3 = t2.send(I2, isShutdownRequested);
			System.out.println("T: isShutdownRequested sent");

			MyTermination_T_3_Cases cases = t3.branch(I2);
			switch (cases.op) {
			case False:
				System.out.println("T: false");
				t2 = cases.receive(I2, False);
				z = x + y;
				x = y;
				y = z;
				System.out.println("fib = " + z);
				break;
			case True:
				System.out.println("T: true");
				cases.receive(I2, True).send(M, result, z);
				System.out.println("終了しました。");
				break Exit;
			}
		}

		return z;
	}
}
