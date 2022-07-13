package com.example.goldenteamproject.activites;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.goldenteamproject.DBHelper;
import com.example.goldenteamproject.HomeActivity;
import com.example.goldenteamproject.R;
import com.example.goldenteamproject.User;

import java.util.List;

public class LoginActivity extends AppCompatActivity {
    private EditText emailEditTextlogin,passwordEditTextlogin;
    private DBHelper DB,Db;
    private Button loginButton;
    List<User> users;
   public String last_user_nam;
    public String last_user_email;
    public String last_user_pass;
    public User last_user;
    SharedPreferences sharedPreferences;
///shared pref key and name
    private static final String SHARED_PREF_NAME ="mypref";
    private static final String KEY_PASS ="pass";
    private static final String KEY_EMAIL ="email";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this for full size on the screen of this activity
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow()
                .setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to here

        setContentView(R.layout.activity_login);
        ///////////////////////////////


            ///shared prefrance//////////
            sharedPreferences= getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
            String email = sharedPreferences.getString(KEY_EMAIL,null);
            if (email != null){
                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
            }
        emailEditTextlogin = findViewById(R.id.editTextOfEmailInSignInActivity);
        passwordEditTextlogin = findViewById(R.id.editTextOfPasswordInsignInActivity);
        loginButton = findViewById(R.id.signInButtonoflogin);

        DB= new DBHelper(LoginActivity.this);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ///////shared pref
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_EMAIL,emailEditTextlogin.getText().toString());
//                editor.putString(KEY_PASS,passwordEditTextlogin.getText().toString());
                editor.apply();

                String  email= emailEditTextlogin.getText().toString().trim();
                String pass= passwordEditTextlogin.getText().toString().trim();
                if (pass.equals("")){
                    passwordEditTextlogin.setError("Error");
                }
                ///////////////////////////////////////
                if (email.equals("")||pass.equals("")){
                    Toast.makeText(LoginActivity.this, "Please Enter the empty fields !", Toast.LENGTH_SHORT).show();
                }else {
                    boolean  checkemailpassword = DB.checkemailpassword(email, pass);
                         if (checkemailpassword ==true){
                               Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                               startActivity(intent);
                               }else{
                               Toast.makeText(LoginActivity.this, "Invalid!! ", Toast.LENGTH_SHORT).show();
                       }
                    }
             }
        });



    }


    public void register(View view) {
        startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
    }
}
