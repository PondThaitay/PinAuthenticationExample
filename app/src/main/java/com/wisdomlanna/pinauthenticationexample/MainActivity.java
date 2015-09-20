package com.wisdomlanna.pinauthenticationexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.kbeanie.pinscreenlibrary.storage.PINPreferences;

public class MainActivity extends AppCompatActivity {

    private Button btnCreatePin, btnUnlock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("POND", "RF" + isPinSetup());

        btnCreatePin = (Button) findViewById(R.id.btnCreatePin);
        btnCreatePin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PinSetupActivity.class));
            }
        });

        btnUnlock = (Button) findViewById(R.id.btnUnlock);
        btnUnlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PinUnlockActivity.class));
            }
        });
    }

    private boolean isPinSetup() {
        PINPreferences preferences = new PINPreferences(this);
        return preferences.isPinSetup();
    }
}
