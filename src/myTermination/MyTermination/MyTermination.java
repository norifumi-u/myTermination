package myTermination.MyTermination;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.scribble.core.type.name.Role;
import myTermination.MyTermination.roles.*;
import myTermination.MyTermination.ops.*;

public final class MyTermination extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("myTermination.MyTermination");
	public static final I2 I2 = myTermination.MyTermination.roles.I2.I2;
	public static final I1 I1 = myTermination.MyTermination.roles.I1.I1;
	public static final M M = myTermination.MyTermination.roles.M.M;
	public static final T T = myTermination.MyTermination.roles.T.T;
	public static final result result = myTermination.MyTermination.ops.result.result;
	public static final shutdownRequest shutdownRequest = myTermination.MyTermination.ops.shutdownRequest.shutdownRequest;
	public static final isShutdownRequested isShutdownRequested = myTermination.MyTermination.ops.isShutdownRequested.isShutdownRequested;
	public static final start start = myTermination.MyTermination.ops.start.start;
	public static final False False = myTermination.MyTermination.ops.False.False;
	public static final True True = myTermination.MyTermination.ops.True.True;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(new Role[] {I2, I1, M, T}));

	public MyTermination() {
		super(MyTermination.IMPATH, MyTermination.SOURCE, MyTermination.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return MyTermination.ROLES;
	}
}