package myTermination.MyTermination.statechans.T.ioifaces;

import myTermination.MyTermination.ops.*;

public interface Case_T_I2_False__I2_True<__Succ1 extends Succ_In_I2_False, __Succ2 extends Succ_In_I2_True> extends In_I2_False<__Succ1>, In_I2_True<__Succ2> {
	public static final Branch_T_I2_False__I2_True<?, ?> cast = null;

	abstract Branch_T_I2_False__I2_True.Branch_T_I2_False__I2_True_Enum getOp();

	abstract public __Succ1 receive(False op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ2 receive(True op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}