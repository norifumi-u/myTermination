package myTermination.MyTermination.statechans.I2.ioifaces;

import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.I2.*;

public interface Receive_I2_T_isShutdownRequested<__Succ1 extends Succ_In_T_isShutdownRequested> extends In_T_isShutdownRequested<__Succ1>, Succ_Out_T_False {
	public static final Receive_I2_T_isShutdownRequested<?> cast = null;

	abstract public __Succ1 async(T role, isShutdownRequested op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_I2_T_isShutdownRequested<?> to(Receive_I2_T_isShutdownRequested<?> cast) {
		return (Receive_I2_T_isShutdownRequested<?>) this;
	}

	default MyTermination_I2_1 to(MyTermination_I2_1 cast) {
		return (MyTermination_I2_1) this;
	}
}