package myTermination.MyTermination.statechans.M.ioifaces;

import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.M.*;

public interface Receive_M_T_result_Int<__Succ1 extends Succ_In_T_result_Int> extends In_T_result_Int<__Succ1>, Succ_Out_I1_shutdownRequest {
	public static final Receive_M_T_result_Int<?> cast = null;

	abstract public myTermination.MyTermination.statechans.M.EndSocket async(T role, result op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_M_T_result_Int<?> to(Receive_M_T_result_Int<?> cast) {
		return (Receive_M_T_result_Int<?>) this;
	}

	default MyTermination_M_3 to(MyTermination_M_3 cast) {
		return (MyTermination_M_3) this;
	}
}