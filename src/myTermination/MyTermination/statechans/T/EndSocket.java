package myTermination.MyTermination.statechans.T;

import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.T.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyTermination, T> implements Succ_Out_M_result_Int {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyTermination, T> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}