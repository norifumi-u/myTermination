package myTermination.MyTermination.statechans.I2;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class MyTermination_I2_1_Future extends org.scribble.runtime.util.ScribFuture {

	protected MyTermination_I2_1_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public MyTermination_I2_1_Future sync() throws IOException {
		super.get();
		return this;
	}
}