package com.wisdomlanna.pinauthenticationexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.kbeanie.pinscreenlibrary.views.PinEntrySetupListener;
import com.kbeanie.pinscreenlibrary.views.PinView;

/**
 * Created by AdminPond on 20/9/2558.
 */
public class PinSetupActivity extends AppCompatActivity implements PinEntrySetupListener {

    private PinView pinView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pin_activity);

        pinView = (PinView) findViewById(R.id.pinView);
        pinView.setModeSetup(this);
    }

    @Override
    public void onPinEntered(String s) {
        Log.i("POND", "onPinEntered : " + s);
    }

    @Override
    public void onPinConfirmed(String s) {
        Log.i("POND", "onPinConfirmed : " + s);
    }

    @Override
    public void onPinMismatch() {
        Log.i("POND", "onPinMismatch : ");
    }

    @Override
    public void onPinSet(String s) {
        Log.i("POND", "onPinSet : " + s);
    }
}
