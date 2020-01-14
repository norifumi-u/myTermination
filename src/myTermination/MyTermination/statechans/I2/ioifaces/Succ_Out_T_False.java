package myTermination.MyTermination.statechans.I2.ioifaces;

public interface Succ_Out_T_False {

	default Receive_I2_T_isShutdownRequested<?> to(Receive_I2_T_isShutdownRequested<?> cast) {
		return (Receive_I2_T_isShutdownRequested<?>) this;
	}
}