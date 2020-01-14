package myTermination.MyTermination.statechans.I1.ioifaces;

import myTermination.MyTermination.ops.*;

public interface Case_I1_M_go__M_shutdownRequest<__Succ1 extends Succ_In_M_go, __Succ2 extends Succ_In_M_shutdownRequest> extends In_M_go<__Succ1>, In_M_shutdownRequest<__Succ2> {
	public static final Branch_I1_M_go__M_shutdownRequest<?, ?> cast = null;

	abstract Branch_I1_M_go__M_shutdownRequest.Branch_I1_M_go__M_shutdownRequest_Enum getOp();

	abstract public __Succ1 receive(go op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public myTermination.MyTermination.statechans.I1.EndSocket receive(shutdownRequest op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}