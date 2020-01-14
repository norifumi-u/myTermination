package myTermination.MyTermination.statechans.I2.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface Out_T_True<__Succ extends Succ_Out_T_True> {

	abstract public __Succ send(T role, True op) throws org.scribble.main.ScribRuntimeException, IOException;
}