package myTermination.MyTermination.statechans.M.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface Out_I1_go<__Succ extends Succ_Out_I1_go> {

	abstract public __Succ send(I1 role, go op) throws org.scribble.main.ScribRuntimeException, IOException;
}