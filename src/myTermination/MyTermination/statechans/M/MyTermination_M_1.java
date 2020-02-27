package myTermination.MyTermination.statechans.M;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.M.ioifaces.*;

public final class MyTermination_M_1 extends org.scribble.runtime.statechans.OutputSocket<MyTermination, M> implements Select_M_T_start<MyTermination_M_2> {
	public static final MyTermination_M_1 cast = null;

	protected MyTermination_M_1(org.scribble.runtime.session.SessionEndpoint<MyTermination, M> se, boolean dummy) {
		super(se);
	}

	public MyTermination_M_1(org.scribble.runtime.session.MPSTEndpoint<MyTermination, M> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public MyTermination_M_2 send(T role, start op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyTermination.start);

		return new MyTermination_M_2(this.se, true);
	}
}