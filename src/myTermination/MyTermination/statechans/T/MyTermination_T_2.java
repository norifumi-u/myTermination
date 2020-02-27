package myTermination.MyTermination.statechans.T;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.T.ioifaces.*;

public final class MyTermination_T_2 extends org.scribble.runtime.statechans.OutputSocket<MyTermination, T> implements Select_T_I2_isShutdownRequested<MyTermination_T_3> {
	public static final MyTermination_T_2 cast = null;

	protected MyTermination_T_2(org.scribble.runtime.session.SessionEndpoint<MyTermination, T> se, boolean dummy) {
		super(se);
	}

	public MyTermination_T_3 send(I2 role, isShutdownRequested op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyTermination.isShutdownRequested);

		return new MyTermination_T_3(this.se, true);
	}
}