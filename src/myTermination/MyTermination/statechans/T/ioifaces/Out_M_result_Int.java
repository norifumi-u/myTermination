package myTermination.MyTermination.statechans.T.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface Out_M_result_Int<__Succ extends Succ_Out_M_result_Int> {

	abstract public __Succ send(M role, result op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}