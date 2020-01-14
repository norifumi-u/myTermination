package myTermination.MyTermination.statechans.I2.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface In_T_isShutdownRequested<__Succ extends Succ_In_T_isShutdownRequested> {

	abstract public __Succ receive(T role, isShutdownRequested op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}