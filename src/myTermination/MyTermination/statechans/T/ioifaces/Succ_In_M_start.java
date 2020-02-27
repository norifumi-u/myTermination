package myTermination.MyTermination.statechans.T.ioifaces;

public interface Succ_In_M_start {

	default Select_T_I2_isShutdownRequested<?> to(Select_T_I2_isShutdownRequested<?> cast) {
		return (Select_T_I2_isShutdownRequested<?>) this;
	}
}