package myTermination.MyTermination.statechans.M.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface In_T_result_Int<__Succ extends Succ_In_T_result_Int> {

	abstract public __Succ receive(T role, result op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}