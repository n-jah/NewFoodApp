package com.example.goldenteamproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.goldenteamproject.R;
import com.example.goldenteamproject.activites.LoginActivity;
import com.example.goldenteamproject.databinding.ActivityHomeBinding;
import com.example.goldenteamproject.databinding.ActivityLoginBinding;
import com.example.goldenteamproject.databinding.ActivityWellcomeBinding;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;
    private AppBarConfiguration mAppBarConfiguration;
    Button logOutButton;
    TextView userNameTV,userNameNav,emailUserNav;
    private DBHelper DB,Db;
    List<User> users;
    public String last_user_nam;
    public String last_user_email;
    public String last_user_pass;
    public User last_user;
    public String email,name;
    ///shared pref key and name
    private static final String SHARED_PREF_NAME ="mypref";
    private static final String KEY_PASS ="pass";
    private static final String KEY_EMAIL ="email";
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
            email = sharedPreferences.getString(KEY_EMAIL,null);
            if (email!=null){
//
//                if (last_user_emaileemail) {
//                    Toast.makeText(this, last_user_nam.toString(), Toast.LENGTH_SHORT).show();
//                    Toast.makeText(this, "seccess", Toast.LENGTH_SHORT).show();
//                }
//                Toast.makeText(this, "rrrr", Toast.LENGTH_SHORT).show();
///                userNameTV.setText("Hello"+" ");
            }
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.appBarHome.toolbar);
/////////////////////////////////////////////////////////////////
        logOutButton =findViewById(R.id.logout);
        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Toast.makeText(HomeActivity.this, "Loged Out", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(HomeActivity.this, ActivityLoginBinding.class);
//                startActivity(intent);
                finish();
            }
        });
        ////////////////////////////////////////////
        //change name by the user name
        ////////////////////////////////////////////////////
        Db= new DBHelper(HomeActivity.this);
        users=Db.getName(email);
        last_user= users.get(users.size()-1);
        last_user_nam=last_user.getName();
        last_user_email=last_user.getEmail();
        last_user_pass= last_user.getPass();
        userNameTV= findViewById(R.id.username);
        userNameNav= findViewById(R.id.usernamenav);
        emailUserNav=findViewById(R.id.emailusernav);
        ///////////////////////////////////////
        //emailUserNav.setText(email+"@gmail.com");
        DrawerLayout drawer =findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_dialy_meal, R.id.nav_favourite)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home);
         NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

}
