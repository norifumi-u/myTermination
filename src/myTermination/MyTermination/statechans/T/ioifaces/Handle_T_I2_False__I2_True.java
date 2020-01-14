package myTermination.MyTermination.statechans.T.ioifaces;

import myTermination.MyTermination.ops.*;

public interface Handle_T_I2_False__I2_True<__Succ1 extends Succ_In_I2_False, __Succ2 extends Succ_In_I2_True> extends Callback_I2_False<__Succ1>, Callback_I2_True<__Succ2> {

	abstract public void receive(__Succ1 schan, False op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, True op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}