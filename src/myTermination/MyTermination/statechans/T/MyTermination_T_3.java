package myTermination.MyTermination.statechans.T;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.T.ioifaces.*;

public final class MyTermination_T_3 extends org.scribble.runtime.statechans.BranchSocket<MyTermination, T> implements Branch_T_I2_False__I2_True<MyTermination_T_2, MyTermination_T_4> {
	public static final MyTermination_T_3 cast = null;

	protected MyTermination_T_3(org.scribble.runtime.session.SessionEndpoint<MyTermination, T> se, boolean dummy) {
		super(se);
	}

	@Override
	public MyTermination_T_3_Cases branch(I2 role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTermination.I2);
		Branch_T_I2_False__I2_True_Enum openum;
		if (m.op.equals(MyTermination.False)) {
			openum = Branch_T_I2_False__I2_True_Enum.False;
		}
		else if (m.op.equals(MyTermination.True)) {
			openum = Branch_T_I2_False__I2_True_Enum.True;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new MyTermination_T_3_Cases(this.se, true, openum, m);
	}

	public void branch(I2 role, MyTermination_T_3_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_T_I2_False__I2_True<MyTermination_T_2, MyTermination_T_4>) handler);
	}

	@Override
	public void branch(I2 role, Handle_T_I2_False__I2_True<MyTermination_T_2, MyTermination_T_4> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTermination.I2);
		if (m.op.equals(MyTermination.False)) {
			handler.receive(new MyTermination_T_2(this.se, true), MyTermination.False);
		}
		else
		if (m.op.equals(MyTermination.True)) {
			handler.receive(new MyTermination_T_4(this.se, true), MyTermination.True);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(I2 role, Handle_T_I2_False__I2_True<Succ_In_I2_False, Succ_In_I2_True> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTermination.I2);
		if (m.op.equals(MyTermination.False)) {
			handler.receive(new MyTermination_T_2(this.se, true), MyTermination.False);
		}
		else
		if (m.op.equals(MyTermination.True)) {
			handler.receive(new MyTermination_T_4(this.se, true), MyTermination.True);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}