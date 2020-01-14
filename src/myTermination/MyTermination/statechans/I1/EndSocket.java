package myTermination.MyTermination.statechans.I1;

import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.I1.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyTermination, I1> implements Succ_In_M_shutdownRequest {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyTermination, I1> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}