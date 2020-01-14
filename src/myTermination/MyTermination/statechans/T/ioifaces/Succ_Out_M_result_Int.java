package myTermination.MyTermination.statechans.T.ioifaces;

import myTermination.MyTermination.statechans.T.EndSocket;

public interface Succ_Out_M_result_Int {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}