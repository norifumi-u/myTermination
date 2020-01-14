package myTermination.MyTermination.statechans.I1.ioifaces;

import myTermination.MyTermination.statechans.I1.EndSocket;

public interface Succ_In_M_shutdownRequest {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}