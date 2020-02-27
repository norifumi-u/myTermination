package myTermination.MyTermination.statechans.T.ioifaces;

import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.T.*;

public interface Branch_T_I2_False__I2_True<__Succ1 extends Succ_In_I2_False, __Succ2 extends Succ_In_I2_True> extends Succ_Out_I2_isShutdownRequested {
	public static final Branch_T_I2_False__I2_True<?, ?> cast = null;

	abstract Case_T_I2_False__I2_True<__Succ1, __Succ2> branch(I2 role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(I2 role, Handle_T_I2_False__I2_True<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(I2 role, Handle_T_I2_False__I2_True<Succ_In_I2_False, Succ_In_I2_True> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_T_I2_False__I2_True<?, ?> to(Branch_T_I2_False__I2_True<?, ?> cast) {
		return (Branch_T_I2_False__I2_True<?, ?>) this;
	}

	default MyTermination_T_3 to(MyTermination_T_3 cast) {
		return (MyTermination_T_3) this;
	}

public enum Branch_T_I2_False__I2_True_Enum implements org.scribble.runtime.session.OpEnum {
	False, True
}
}