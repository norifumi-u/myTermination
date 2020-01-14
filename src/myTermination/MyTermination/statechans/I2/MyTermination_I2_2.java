package myTermination.MyTermination.statechans.I2;

import java.io.IOException;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.statechans.I2.ioifaces.*;

public final class MyTermination_I2_2 extends org.scribble.runtime.statechans.OutputSocket<MyTermination, I2> implements Select_I2_T_False__T_True<MyTermination_I2_1, EndSocket> {
	public static final MyTermination_I2_2 cast = null;

	protected MyTermination_I2_2(org.scribble.runtime.session.SessionEndpoint<MyTermination, I2> se, boolean dummy) {
		super(se);
	}

	public MyTermination_I2_1 send(T role, False op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyTermination.False);

		return new MyTermination_I2_1(this.se, true);
	}

	public myTermination.MyTermination.statechans.I2.EndSocket send(T role, True op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyTermination.True);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}