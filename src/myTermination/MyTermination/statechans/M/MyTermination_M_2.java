package myTermination.MyTermination.statechans.M;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.M.ioifaces.*;

public final class MyTermination_M_2 extends org.scribble.runtime.statechans.OutputSocket<MyTermination, M> implements Select_M_I1_shutdownRequest<MyTermination_M_3> {
	public static final MyTermination_M_2 cast = null;

	protected MyTermination_M_2(org.scribble.runtime.session.SessionEndpoint<MyTermination, M> se, boolean dummy) {
		super(se);
	}

	public MyTermination_M_3 send(I1 role, shutdownRequest op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyTermination.shutdownRequest);

		return new MyTermination_M_3(this.se, true);
	}
}