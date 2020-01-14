package myTermination.MyTermination.statechans.I1;

import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.I1.ioifaces.*;

public final class MyTermination_I1_1_Cases extends org.scribble.runtime.statechans.CaseSocket<MyTermination, I1> implements Case_I1_M_go__M_shutdownRequest<MyTermination_I1_1, EndSocket> {
	public static final MyTermination_I1_1_Cases cast = null;
	public final MyTermination_I1_1.Branch_I1_M_go__M_shutdownRequest_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected MyTermination_I1_1_Cases(org.scribble.runtime.session.SessionEndpoint<MyTermination, I1> se, boolean dummy, MyTermination_I1_1.Branch_I1_M_go__M_shutdownRequest_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public MyTermination_I1_1 receive(M role, go op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyTermination.go)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new MyTermination_I1_1(this.se, true);
	}

	public MyTermination_I1_1 receive(go op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyTermination.M, op);
	}

	public myTermination.MyTermination.statechans.I1.EndSocket receive(M role, shutdownRequest op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyTermination.shutdownRequest)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public myTermination.MyTermination.statechans.I1.EndSocket receive(shutdownRequest op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyTermination.M, op);
	}

	@Override
	public Branch_I1_M_go__M_shutdownRequest.Branch_I1_M_go__M_shutdownRequest_Enum getOp() {
		return this.op;
	}
}