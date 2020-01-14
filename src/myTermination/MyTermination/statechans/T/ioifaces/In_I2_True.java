package myTermination.MyTermination.statechans.T.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface In_I2_True<__Succ extends Succ_In_I2_True> {

	abstract public __Succ receive(I2 role, True op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}