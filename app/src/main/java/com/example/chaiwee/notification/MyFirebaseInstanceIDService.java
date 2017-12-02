package com.example.chaiwee.notification;

import com.google.firebase.iid.FirebaseInstanceIdService;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by Chai Wee on 2017/11/20.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";
    public static final String REGISTRATION_SUCCESS = "RegistrationSuccess";

    @Override
    public void onTokenRefresh() {
        // to get instance ID token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);   //sending the token to server
    }

    // [END refresh_token]

    /**
     * Persist token to third-party servers.
     *
     * Modify this method to associate the user's FCM InstanceID token with any server-side account
     * maintained by your application.
     *
     * @param token The new token.
     */
    private void sendRegistrationToServer(String token) {
    }
}
