package myTermination.MyTermination.statechans.T.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface Out_I2_isShutdownRequested<__Succ extends Succ_Out_I2_isShutdownRequested> {

	abstract public __Succ send(I2 role, isShutdownRequested op) throws org.scribble.main.ScribRuntimeException, IOException;
}