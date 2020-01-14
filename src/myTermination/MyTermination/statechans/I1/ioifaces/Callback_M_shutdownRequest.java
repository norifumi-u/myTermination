package myTermination.MyTermination.statechans.I1.ioifaces;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public interface Callback_M_shutdownRequest<__Succ extends Succ_In_M_shutdownRequest> {

	abstract public void receive(__Succ schan, shutdownRequest op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}