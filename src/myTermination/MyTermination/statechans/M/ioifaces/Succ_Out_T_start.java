package myTermination.MyTermination.statechans.M.ioifaces;

public interface Succ_Out_T_start {

	default Select_M_I1_shutdownRequest<?> to(Select_M_I1_shutdownRequest<?> cast) {
		return (Select_M_I1_shutdownRequest<?>) this;
	}
}