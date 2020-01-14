package myTermination.MyTermination.statechans.T;

import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.T.ioifaces.*;

public final class MyTermination_T_2_Cases extends org.scribble.runtime.statechans.CaseSocket<MyTermination, T> implements Case_T_I2_False__I2_True<MyTermination_T_1, MyTermination_T_3> {
	public static final MyTermination_T_2_Cases cast = null;
	public final MyTermination_T_2.Branch_T_I2_False__I2_True_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected MyTermination_T_2_Cases(org.scribble.runtime.session.SessionEndpoint<MyTermination, T> se, boolean dummy, MyTermination_T_2.Branch_T_I2_False__I2_True_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public MyTermination_T_1 receive(I2 role, False op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyTermination.False)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new MyTermination_T_1(this.se, true);
	}

	public MyTermination_T_1 receive(False op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyTermination.I2, op);
	}

	public MyTermination_T_3 receive(I2 role, True op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyTermination.True)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new MyTermination_T_3(this.se, true);
	}

	public MyTermination_T_3 receive(True op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyTermination.I2, op);
	}

	@Override
	public Branch_T_I2_False__I2_True.Branch_T_I2_False__I2_True_Enum getOp() {
		return this.op;
	}
}