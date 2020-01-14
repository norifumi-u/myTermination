package myTermination;

import static myTermination.MyTermination.MyTermination.*;

import java.util.Date;

import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.SocketChannelEndpoint;
import org.scribble.runtime.session.MPSTEndpoint;
import org.scribble.runtime.util.Buf;

import myTermination.MyTermination.MyTermination;
import myTermination.MyTermination.roles.M;
import myTermination.MyTermination.statechans.M.MyTermination_M_1;

public class Main {
    public static void main(String[] args) throws Exception {

        MyTermination termination = new MyTermination();
		try (MPSTEndpoint<MyTermination, M> main =
				new MPSTEndpoint<>(termination, M, new ObjectStreamFormatter())) {
		    main.request(I1, SocketChannelEndpoint::new, "localhost", 8888);
		    main.request(T, SocketChannelEndpoint::new, "localhost", 6666);

		    MyTermination_M_1 m1 = new MyTermination_M_1(main);
		    long start = new Date().getTime();
		    while(new Date().getTime() - start < 1000) {
		    	m1 = m1.send(I1, go);
		    }
		    var m2 = m1.send(I1, shutdownRequest);
		    var b = new Buf<Integer>();
		    m2.receive(T, result, b);
		    System.out.println("answer = " + b.val);
//		    request(new MyTermination_M_1(main));
		}
    }

//    private static void request(MyTermination_M_1 m1) throws Exception {
//		int t = 0;
//		while (t < 500) {
//			m1.send(I1, go);
//		    t++;
//		}
//		m1.send(I1, shutdownRequest);
//    }
}
