package myTermination.MyTermination.statechans.T.ioifaces;

import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.T.*;

public interface Select_T_M_result_Int<__Succ1 extends Succ_Out_M_result_Int> extends Out_M_result_Int<__Succ1>, Succ_In_I2_True {
	public static final Select_T_M_result_Int<?> cast = null;

	@Override
	default Select_T_M_result_Int<?> to(Select_T_M_result_Int<?> cast) {
		return (Select_T_M_result_Int<?>) this;
	}

	default MyTermination_T_4 to(MyTermination_T_4 cast) {
		return (MyTermination_T_4) this;
	}
}