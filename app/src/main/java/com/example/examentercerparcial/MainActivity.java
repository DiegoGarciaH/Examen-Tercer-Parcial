package com.example.examentercerparcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.examentercerparcial.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    BottomNavigationView bottomNavigationView;

    fragment_home f_home = new fragment_home();
    fragment_calculate f_calculate= new fragment_calculate();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, f_calculate).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_home:getSupportFragmentManager().beginTransaction().replace(R.id.container, f_home).commit();return true;
                    case R.id.navigation_calculate:a:getSupportFragmentManager().beginTransaction().replace(R.id.container, f_calculate).commit();return true;

                }
                return false;
            }
        });
    }
}