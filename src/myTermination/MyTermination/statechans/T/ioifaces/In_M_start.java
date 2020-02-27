package myTermination.MyTermination.statechans.T.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface In_M_start<__Succ extends Succ_In_M_start> {

	abstract public __Succ receive(M role, start op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}