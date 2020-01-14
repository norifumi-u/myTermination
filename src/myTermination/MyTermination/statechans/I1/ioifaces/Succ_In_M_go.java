package myTermination.MyTermination.statechans.I1.ioifaces;

public interface Succ_In_M_go {

	default Branch_I1_M_go__M_shutdownRequest<?, ?> to(Branch_I1_M_go__M_shutdownRequest<?, ?> cast) {
		return (Branch_I1_M_go__M_shutdownRequest<?, ?>) this;
	}
}