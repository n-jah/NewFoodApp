package com.example.goldenteamproject.activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.goldenteamproject.R;

public class wellcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this for full size on the screen of this activity
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow()
                .setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to here




        setContentView(R.layout.activity_wellcome);
    }

    public void register(View view) {
        startActivity(new Intent(wellcomeActivity.this, RegistrationActivity.class));

    }



    public void signIn(View view) {
        startActivity(new Intent(wellcomeActivity.this, LoginActivity.class));
    }
}