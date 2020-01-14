package myTermination.MyTermination.statechans.T.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface Callback_I2_True<__Succ extends Succ_In_I2_True> {

	abstract public void receive(__Succ schan, True op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}