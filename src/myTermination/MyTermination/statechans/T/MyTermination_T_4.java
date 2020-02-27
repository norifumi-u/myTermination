package myTermination.MyTermination.statechans.T;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.T.ioifaces.*;

public final class MyTermination_T_4 extends org.scribble.runtime.statechans.OutputSocket<MyTermination, T> implements Select_T_M_result_Int<EndSocket> {
	public static final MyTermination_T_4 cast = null;

	protected MyTermination_T_4(org.scribble.runtime.session.SessionEndpoint<MyTermination, T> se, boolean dummy) {
		super(se);
	}

	public myTermination.MyTermination.statechans.T.EndSocket send(M role, result op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyTermination.result, arg0);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}