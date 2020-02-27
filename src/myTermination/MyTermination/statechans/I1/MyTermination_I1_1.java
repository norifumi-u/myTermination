package myTermination.MyTermination.statechans.I1;

import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.I1.ioifaces.*;

public final class MyTermination_I1_1 extends org.scribble.runtime.statechans.ReceiveSocket<MyTermination, I1> implements Receive_I1_M_shutdownRequest<EndSocket> {
	public static final MyTermination_I1_1 cast = null;

	protected MyTermination_I1_1(org.scribble.runtime.session.SessionEndpoint<MyTermination, I1> se, boolean dummy) {
		super(se);
	}

	public MyTermination_I1_1(org.scribble.runtime.session.MPSTEndpoint<MyTermination, I1> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public myTermination.MyTermination.statechans.I1.EndSocket receive(M role, shutdownRequest op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.readScribMessage(MyTermination.M);
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public myTermination.MyTermination.statechans.I1.EndSocket async(M role, shutdownRequest op, org.scribble.runtime.util.Buf<MyTermination_I1_1_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new MyTermination_I1_1_Future(super.getFuture(MyTermination.M));
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(MyTermination.M);
	}

	@SuppressWarnings("unchecked")
	public myTermination.MyTermination.statechans.I1.EndSocket async(M role, shutdownRequest op) throws org.scribble.main.ScribRuntimeException {
		return async(MyTermination.M, op, (org.scribble.runtime.util.Buf<MyTermination_I1_1_Future>) this.se.gc);
	}
}