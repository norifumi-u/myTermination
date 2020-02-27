package myTermination.MyTermination.statechans.I1.ioifaces;

import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.I1.*;

public interface Receive_I1_M_shutdownRequest<__Succ1 extends Succ_In_M_shutdownRequest> extends In_M_shutdownRequest<__Succ1> {
	public static final Receive_I1_M_shutdownRequest<?> cast = null;

	abstract public myTermination.MyTermination.statechans.I1.EndSocket async(M role, shutdownRequest op) throws org.scribble.main.ScribRuntimeException;

	default MyTermination_I1_1 to(MyTermination_I1_1 cast) {
		return (MyTermination_I1_1) this;
	}
}