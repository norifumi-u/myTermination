package myTermination.MyTermination.statechans.I2.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface Out_T_False<__Succ extends Succ_Out_T_False> {

	abstract public __Succ send(T role, False op) throws org.scribble.main.ScribRuntimeException, IOException;
}