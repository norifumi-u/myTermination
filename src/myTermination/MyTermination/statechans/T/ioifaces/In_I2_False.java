package myTermination.MyTermination.statechans.T.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface In_I2_False<__Succ extends Succ_In_I2_False> {

	abstract public __Succ receive(I2 role, False op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}