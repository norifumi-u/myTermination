package myTermination.MyTermination.statechans.T.ioifaces;

import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.T.*;

public interface Select_T_I2_isShutdownRequested<__Succ1 extends Succ_Out_I2_isShutdownRequested> extends Out_I2_isShutdownRequested<__Succ1>, Succ_In_M_start, Succ_In_I2_False {
	public static final Select_T_I2_isShutdownRequested<?> cast = null;

	@Override
	default Select_T_I2_isShutdownRequested<?> to(Select_T_I2_isShutdownRequested<?> cast) {
		return (Select_T_I2_isShutdownRequested<?>) this;
	}

	default MyTermination_T_2 to(MyTermination_T_2 cast) {
		return (MyTermination_T_2) this;
	}
}