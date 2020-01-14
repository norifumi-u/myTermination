package myTermination.MyTermination.statechans.I2;

import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.I2.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyTermination, I2> implements Succ_Out_T_True {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyTermination, I2> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}