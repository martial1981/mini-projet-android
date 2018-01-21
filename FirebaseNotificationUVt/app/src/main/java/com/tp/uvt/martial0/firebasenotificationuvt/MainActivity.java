package com.tp.uvt.martial0.firebasenotificationuvt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Mainactivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowToken = (Button) findViewById(R.id.btnShowToken);
        btnShowToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String Token = FirebaseInstanceId.getInstance().getToken();
                Log.d(TAG,"Token"+Token);
                Toast.makeText(MainActivity.this,Token,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
