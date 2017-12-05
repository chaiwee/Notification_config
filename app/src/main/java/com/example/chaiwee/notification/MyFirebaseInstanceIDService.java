package com.example.chaiwee.notification;

import com.google.firebase.iid.FirebaseInstanceIdService;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by Chai Wee on 2017/11/20.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";
    //public static final String REGISTRATION_SUCCESS = "RegistrationSuccess";

    @Override
    public void onTokenRefresh() {
        // to get instance ID token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
    }

    // [END refresh_token]
}
