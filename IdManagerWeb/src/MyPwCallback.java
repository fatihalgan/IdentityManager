import org.apache.ws.security.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

public class MyPwCallback implements CallbackHandler {

    /*
     * (non-Javadoc)
     * @see javax.security.auth.callback.CallbackHandler#handle(javax.security.auth.callback.Callback[])
     */

    /**
     * Method handle
     *
     * @param callbacks
     * @throws IOException
     * @throws UnsupportedCallbackException
     */
    public void handle(Callback[] callbacks)
            throws IOException, UnsupportedCallbackException {

        for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof WSPasswordCallback) {
                WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];

                /*
                 * here call a function/method to lookup the password for
                 * the given identifier (e.g. a user name or keystore alias)
                 * e.g.: pc.setPassword(passStore.getPassword(pc.getIdentfifier))
                 * for festing we supply a fixed name here.
                 */
                pc.setPassword("clientpw");
            } else {
                throw new UnsupportedCallbackException(callbacks[i],
                        "Unrecognized Callback");
            }
        }
    }
}
