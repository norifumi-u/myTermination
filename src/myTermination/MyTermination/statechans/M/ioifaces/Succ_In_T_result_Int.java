package myTermination.MyTermination.statechans.M.ioifaces;

import myTermination.MyTermination.statechans.M.EndSocket;

public interface Succ_In_T_result_Int {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}