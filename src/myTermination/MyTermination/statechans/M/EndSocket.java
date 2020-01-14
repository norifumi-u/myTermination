package myTermination.MyTermination.statechans.M;

import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.M.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyTermination, M> implements Succ_In_T_result_Int {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyTermination, M> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}