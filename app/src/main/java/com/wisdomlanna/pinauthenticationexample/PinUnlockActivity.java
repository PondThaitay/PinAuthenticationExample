package com.wisdomlanna.pinauthenticationexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.kbeanie.pinscreenlibrary.views.PinEntryAuthenticationListener;
import com.kbeanie.pinscreenlibrary.views.PinView;

/**
 * Created by AdminPond on 20/9/2558.
 */
public class PinUnlockActivity extends AppCompatActivity implements PinEntryAuthenticationListener {

    private PinView pinView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pin_activity);

        pinView = (PinView) findViewById(R.id.pinView);
        pinView.setModeAuthenticate(this);
    }

    @Override
    public void onPinCorrect() {
        Log.i("POND", "onPinCorrect");
    }

    @Override
    public void onPinWrong() {
        Log.i("POND", "onPinWrong");
    }
}
