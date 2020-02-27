package myTermination.MyTermination.statechans.I1;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class MyTermination_I1_1_Future extends org.scribble.runtime.util.ScribFuture {

	protected MyTermination_I1_1_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public MyTermination_I1_1_Future sync() throws IOException {
		super.get();
		return this;
	}
}