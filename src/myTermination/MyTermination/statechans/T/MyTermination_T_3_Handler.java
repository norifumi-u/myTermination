package myTermination.MyTermination.statechans.T;

import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.T.ioifaces.*;

public interface MyTermination_T_3_Handler extends Handle_T_I2_False__I2_True<MyTermination_T_2, MyTermination_T_4> {

	@Override
	abstract public void receive(MyTermination_T_2 schan, False op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(MyTermination_T_4 schan, True op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}