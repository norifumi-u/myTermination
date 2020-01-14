package myTermination.MyTermination.statechans.I1.ioifaces;

import myTermination.MyTermination.ops.*;

public interface Handle_I1_M_go__M_shutdownRequest<__Succ1 extends Succ_In_M_go, __Succ2 extends Succ_In_M_shutdownRequest> extends Callback_M_go<__Succ1>, Callback_M_shutdownRequest<__Succ2> {

	abstract public void receive(__Succ1 schan, go op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, shutdownRequest op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}