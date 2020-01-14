package myTermination.MyTermination.statechans.M.ioifaces;

public interface Succ_Out_I1_shutdownRequest {

	default Receive_M_T_result_Int<?> to(Receive_M_T_result_Int<?> cast) {
		return (Receive_M_T_result_Int<?>) this;
	}
}