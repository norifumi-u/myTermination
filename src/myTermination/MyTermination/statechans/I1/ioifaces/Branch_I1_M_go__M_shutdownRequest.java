package myTermination.MyTermination.statechans.I1.ioifaces;

import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.statechans.I1.*;

public interface Branch_I1_M_go__M_shutdownRequest<__Succ1 extends Succ_In_M_go, __Succ2 extends Succ_In_M_shutdownRequest> extends Succ_In_M_go {
	public static final Branch_I1_M_go__M_shutdownRequest<?, ?> cast = null;

	abstract Case_I1_M_go__M_shutdownRequest<__Succ1, __Succ2> branch(M role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(M role, Handle_I1_M_go__M_shutdownRequest<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(M role, Handle_I1_M_go__M_shutdownRequest<Succ_In_M_go, Succ_In_M_shutdownRequest> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_I1_M_go__M_shutdownRequest<?, ?> to(Branch_I1_M_go__M_shutdownRequest<?, ?> cast) {
		return (Branch_I1_M_go__M_shutdownRequest<?, ?>) this;
	}

	default MyTermination_I1_1 to(MyTermination_I1_1 cast) {
		return (MyTermination_I1_1) this;
	}

public enum Branch_I1_M_go__M_shutdownRequest_Enum implements org.scribble.runtime.session.OpEnum {
	go, shutdownRequest
}
}