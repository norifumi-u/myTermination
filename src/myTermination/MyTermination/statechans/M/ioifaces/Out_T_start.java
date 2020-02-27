package myTermination.MyTermination.statechans.M.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface Out_T_start<__Succ extends Succ_Out_T_start> {

	abstract public __Succ send(T role, start op) throws org.scribble.main.ScribRuntimeException, IOException;
}