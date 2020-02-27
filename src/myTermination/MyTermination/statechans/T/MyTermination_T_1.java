package myTermination.MyTermination.statechans.T;

import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.T.ioifaces.*;

public final class MyTermination_T_1 extends org.scribble.runtime.statechans.ReceiveSocket<MyTermination, T> implements Receive_T_M_start<MyTermination_T_2> {
	public static final MyTermination_T_1 cast = null;

	protected MyTermination_T_1(org.scribble.runtime.session.SessionEndpoint<MyTermination, T> se, boolean dummy) {
		super(se);
	}

	public MyTermination_T_1(org.scribble.runtime.session.MPSTEndpoint<MyTermination, T> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public MyTermination_T_2 receive(M role, start op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.readScribMessage(MyTermination.M);
		return new MyTermination_T_2(this.se, true);
	}

	public MyTermination_T_2 async(M role, start op, org.scribble.runtime.util.Buf<MyTermination_T_1_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new MyTermination_T_1_Future(super.getFuture(MyTermination.M));
		return new MyTermination_T_2(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(MyTermination.M);
	}

	@SuppressWarnings("unchecked")
	public MyTermination_T_2 async(M role, start op) throws org.scribble.main.ScribRuntimeException {
		return async(MyTermination.M, op, (org.scribble.runtime.util.Buf<MyTermination_T_1_Future>) this.se.gc);
	}
}