package myTermination.MyTermination.statechans.M.ioifaces;

import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.M.*;

public interface Select_M_I1_shutdownRequest<__Succ1 extends Succ_Out_I1_shutdownRequest> extends Out_I1_shutdownRequest<__Succ1>, Succ_Out_T_start {
	public static final Select_M_I1_shutdownRequest<?> cast = null;

	@Override
	default Select_M_I1_shutdownRequest<?> to(Select_M_I1_shutdownRequest<?> cast) {
		return (Select_M_I1_shutdownRequest<?>) this;
	}

	default MyTermination_M_2 to(MyTermination_M_2 cast) {
		return (MyTermination_M_2) this;
	}
}