package myTermination.MyTermination.statechans.I2.ioifaces;

import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.I2.*;

public interface Select_I2_T_False__T_True<__Succ1 extends Succ_Out_T_False, __Succ2 extends Succ_Out_T_True> extends Out_T_False<__Succ1>, Out_T_True<__Succ2>, Succ_In_T_isShutdownRequested {
	public static final Select_I2_T_False__T_True<?, ?> cast = null;

	@Override
	default Select_I2_T_False__T_True<?, ?> to(Select_I2_T_False__T_True<?, ?> cast) {
		return (Select_I2_T_False__T_True<?, ?>) this;
	}

	default MyTermination_I2_2 to(MyTermination_I2_2 cast) {
		return (MyTermination_I2_2) this;
	}
}