package com.tp.uvt.martial0.firebasenotificationuvt;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by martial0 on 1/2/18.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG ="MyFirebaseInsIDService";

    @Override
    public void onTokenRefresh() {
    //get updated Token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"New Token:"+refreshedToken);


    }
}
