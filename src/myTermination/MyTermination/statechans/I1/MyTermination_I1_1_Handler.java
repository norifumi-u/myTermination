package myTermination.MyTermination.statechans.I1;

import myTermination.MyTermination.ops.*;
import myTermination.MyTermination.*;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.I1.ioifaces.*;

public interface MyTermination_I1_1_Handler extends Handle_I1_M_go__M_shutdownRequest<MyTermination_I1_1, EndSocket> {

	@Override
	abstract public void receive(MyTermination_I1_1 schan, go op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(EndSocket schan, shutdownRequest op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}