package myTermination.MyTermination.statechans.M;

import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.M.ioifaces.*;

public final class MyTermination_M_3 extends org.scribble.runtime.statechans.ReceiveSocket<MyTermination, M> implements Receive_M_T_result_Int<EndSocket> {
	public static final MyTermination_M_3 cast = null;

	protected MyTermination_M_3(org.scribble.runtime.session.SessionEndpoint<MyTermination, M> se, boolean dummy) {
		super(se);
	}

	public myTermination.MyTermination.statechans.M.EndSocket receive(T role, result op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTermination.T);
		arg1.val = (java.lang.Integer) m.payload[0];
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public myTermination.MyTermination.statechans.M.EndSocket async(T role, result op, org.scribble.runtime.util.Buf<MyTermination_M_3_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new MyTermination_M_3_Future(super.getFuture(MyTermination.T));
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(MyTermination.T);
	}

	@SuppressWarnings("unchecked")
	public myTermination.MyTermination.statechans.M.EndSocket async(T role, result op) throws org.scribble.main.ScribRuntimeException {
		return async(MyTermination.T, op, (org.scribble.runtime.util.Buf<MyTermination_M_3_Future>) this.se.gc);
	}
}