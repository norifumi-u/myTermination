package myTermination.MyTermination.statechans.I2;

import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.I2.ioifaces.*;

public final class MyTermination_I2_1 extends org.scribble.runtime.statechans.ReceiveSocket<MyTermination, I2> implements Receive_I2_T_isShutdownRequested<MyTermination_I2_2> {
	public static final MyTermination_I2_1 cast = null;

	protected MyTermination_I2_1(org.scribble.runtime.session.SessionEndpoint<MyTermination, I2> se, boolean dummy) {
		super(se);
	}

	public MyTermination_I2_1(org.scribble.runtime.session.MPSTEndpoint<MyTermination, I2> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public MyTermination_I2_2 receive(T role, isShutdownRequested op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.readScribMessage(MyTermination.T);
		return new MyTermination_I2_2(this.se, true);
	}

	public MyTermination_I2_2 async(T role, isShutdownRequested op, org.scribble.runtime.util.Buf<MyTermination_I2_1_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new MyTermination_I2_1_Future(super.getFuture(MyTermination.T));
		return new MyTermination_I2_2(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(MyTermination.T);
	}

	@SuppressWarnings("unchecked")
	public MyTermination_I2_2 async(T role, isShutdownRequested op) throws org.scribble.main.ScribRuntimeException {
		return async(MyTermination.T, op, (org.scribble.runtime.util.Buf<MyTermination_I2_1_Future>) this.se.gc);
	}
}