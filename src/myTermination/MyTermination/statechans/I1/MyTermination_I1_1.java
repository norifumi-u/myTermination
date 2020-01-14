package myTermination.MyTermination.statechans.I1;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.I1.ioifaces.*;

public final class MyTermination_I1_1 extends org.scribble.runtime.statechans.BranchSocket<MyTermination, I1> implements Branch_I1_M_go__M_shutdownRequest<MyTermination_I1_1, EndSocket> {
	public static final MyTermination_I1_1 cast = null;

	protected MyTermination_I1_1(org.scribble.runtime.session.SessionEndpoint<MyTermination, I1> se, boolean dummy) {
		super(se);
	}

	public MyTermination_I1_1(org.scribble.runtime.session.MPSTEndpoint<MyTermination, I1> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public MyTermination_I1_1_Cases branch(M role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTermination.M);
		Branch_I1_M_go__M_shutdownRequest_Enum openum;
		if (m.op.equals(MyTermination.go)) {
			openum = Branch_I1_M_go__M_shutdownRequest_Enum.go;
		}
		else if (m.op.equals(MyTermination.shutdownRequest)) {
			openum = Branch_I1_M_go__M_shutdownRequest_Enum.shutdownRequest;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new MyTermination_I1_1_Cases(this.se, true, openum, m);
	}

	public void branch(M role, MyTermination_I1_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_I1_M_go__M_shutdownRequest<MyTermination_I1_1, EndSocket>) handler);
	}

	@Override
	public void branch(M role, Handle_I1_M_go__M_shutdownRequest<MyTermination_I1_1, EndSocket> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTermination.M);
		if (m.op.equals(MyTermination.go)) {
			handler.receive(new MyTermination_I1_1(this.se, true), MyTermination.go);
		}
		else
		if (m.op.equals(MyTermination.shutdownRequest)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), MyTermination.shutdownRequest);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(M role, Handle_I1_M_go__M_shutdownRequest<Succ_In_M_go, Succ_In_M_shutdownRequest> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTermination.M);
		if (m.op.equals(MyTermination.go)) {
			handler.receive(new MyTermination_I1_1(this.se, true), MyTermination.go);
		}
		else
		if (m.op.equals(MyTermination.shutdownRequest)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), MyTermination.shutdownRequest);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}