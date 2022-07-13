package com.example.goldenteamproject.activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.goldenteamproject.DBHelper;
import com.example.goldenteamproject.HomeActivity;
import com.example.goldenteamproject.R;
import com.example.goldenteamproject.ui.home.HomeFragment;

public class RegistrationActivity extends AppCompatActivity {
Button registerButton;
DBHelper DB;
EditText userNameEditText,emailEditText,passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this for full size on the screen of this activity
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow()
                .setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to here
        setContentView(R.layout.activity_registration);
        userNameEditText = findViewById(R.id.editTextOfFullName);
        emailEditText = findViewById(R.id.editTextOfEmail);
        passwordEditText =findViewById(R.id.editTextOfPassword);
        registerButton=findViewById(R.id.registerButtonOfRegisterationActivity);
        DB= new DBHelper(this);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String user = userNameEditText.getText().toString();
                String  pass = passwordEditText.getText().toString();
                if (email.equals("")||user.equals("")||pass.equals("")){
                    Toast.makeText(RegistrationActivity.this, "Please Enter all the fields ", Toast.LENGTH_SHORT).show();
                }else{
                    boolean checkemail= DB.checkemail(email);
                    if (checkemail==false){
                        Boolean insert = DB.insertData(email,user,pass);
                        if (insert==true){
                            Toast.makeText(RegistrationActivity.this, "Registration success", Toast.LENGTH_SHORT).show();
//                            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
//                            fragmentTransaction.replace(R.id.layoutof,new HomeFragment()).commit();
                            Intent intent = new Intent(RegistrationActivity.this, HomeActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(RegistrationActivity.this, "Registration field", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(RegistrationActivity.this, "User Already Exists ! Pleas Sign IN", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }


    public void signIn(View view) {
            startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));

    }
}
