package myTermination.MyTermination.statechans.I2.ioifaces;

public interface Succ_In_T_isShutdownRequested {

	default Select_I2_T_False__T_True<?, ?> to(Select_I2_T_False__T_True<?, ?> cast) {
		return (Select_I2_T_False__T_True<?, ?>) this;
	}
}