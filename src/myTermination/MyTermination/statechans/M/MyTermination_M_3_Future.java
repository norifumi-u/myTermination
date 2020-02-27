package myTermination.MyTermination.statechans.M;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class MyTermination_M_3_Future extends org.scribble.runtime.util.ScribFuture {
	public java.lang.Integer pay1;

	protected MyTermination_M_3_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public MyTermination_M_3_Future sync() throws IOException {
		org.scribble.runtime.message.ScribMessage m = super.get();
		this.pay1 = (java.lang.Integer) m.payload[0];
		return this;
	}
}