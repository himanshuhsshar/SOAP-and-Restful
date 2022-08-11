package com.goair.security.handler;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class PCBHandler implements CallbackHandler {
	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			if (callbacks[i] instanceof WSPasswordCallback) {
				WSPasswordCallback wspcb = (WSPasswordCallback) callbacks[i];
				String username = wspcb.getIdentifier();

				if (username.equals("greg")) {
					wspcb.setPassword("welcome1");
				} else {
					throw new UnsupportedCallbackException(callbacks[i]);
				}
			}
		}
	}
}
