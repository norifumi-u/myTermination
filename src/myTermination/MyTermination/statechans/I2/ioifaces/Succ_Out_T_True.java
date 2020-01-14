package myTermination.MyTermination.statechans.I2.ioifaces;

import myTermination.MyTermination.statechans.I2.EndSocket;

public interface Succ_Out_T_True {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}