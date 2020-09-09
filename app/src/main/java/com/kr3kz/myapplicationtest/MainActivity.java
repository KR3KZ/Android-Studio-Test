package com.kr3kz.myapplicationtest;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMain(View view) {setContentView(R.layout.activity_main);}
    public void show2(View view) {setContentView(R.layout.activity_2);}

    public void clickOnValidate(View view) {
        EditText nickname;
        nickname = (EditText) findViewById(R.id.Name);
        Toast.makeText(getApplicationContext(), this.getString(R.string.hello) + " " + nickname.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "App paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "App un-paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "App closed", Toast.LENGTH_SHORT).show();
    }
}
