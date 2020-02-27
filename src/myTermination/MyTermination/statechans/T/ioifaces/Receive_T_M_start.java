package myTermination.MyTermination.statechans.T.ioifaces;

import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.T.*;

public interface Receive_T_M_start<__Succ1 extends Succ_In_M_start> extends In_M_start<__Succ1> {
	public static final Receive_T_M_start<?> cast = null;

	abstract public __Succ1 async(M role, start op) throws org.scribble.main.ScribRuntimeException;

	default MyTermination_T_1 to(MyTermination_T_1 cast) {
		return (MyTermination_T_1) this;
	}
}