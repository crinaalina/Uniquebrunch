package com.example.brunchfast;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class Main2Activity extends AppCompatActivity {
        DrawerLayout drawerLayout;
        ImageButton buttonDrawerToggle;
        NavigationView navigationView;
        private AppBarConfiguration mAppBarConfiguration;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_content);

            // Configurarea DrawerLayout și NavigationView
             drawerLayout = findViewById(R.id.drawer_layout);
            buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
            navigationView = findViewById(R.id.navigationView);



            buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    drawerLayout.open();

                }
            });

            View headerView = navigationView.getHeaderView(0);
            ImageView useImage = headerView.findViewById(R.id.userImage);
            TextView textUsername = headerView.findViewById(R.id.textUsername);

            useImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(Main2Activity.this, textUsername.getText() ,Toast.LENGTH_SHORT).show();
                }
            });



            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    MenuItem item;
                    int itemId = item.getItemId();

                    if(itemId == R.id.nav_menu) {
                        Toast.makeText(Main2Activity.this, "Menu Clicked", Toast.LENGTH_SHORT).show();
                    }

                    if(itemId == R.id.nav_menu) {
                        Toast.makeText(Main2Activity.this, "Favourite Clicked", Toast.LENGTH_SHORT).show();
                    }

                    if(itemId == R.id.nav_menu) {
                        Toast.makeText(Main2Activity.this, "Order Clicked", Toast.LENGTH_SHORT).show();
                    }

                    if(itemId == R.id.nav_menu) {
                        Toast.makeText(Main2Activity.this, "Cart Clicked", Toast.LENGTH_SHORT).show();
                    }

                    if(itemId == R.id.nav_menu) {
                        Toast.makeText(Main2Activity.this, "Share Clicked", Toast.LENGTH_SHORT).show();
                    }

                    if(itemId == R.id.nav_menu) {
                        Toast.makeText(Main2Activity.this, "Settings Clicked", Toast.LENGTH_SHORT).show();
                    }
                    if(itemId == R.id.nav_menu) {
                        Toast.makeText(Main2Activity.this, "Feedback Clicked", Toast.LENGTH_SHORT).show();
                    }

                    if(itemId == R.id.nav_menu) {
                        Toast.makeText(Main2Activity.this, "Terms and Conditions Clicked", Toast.LENGTH_SHORT).show();
                    }

                    drawerLayout.close();

                    return false;
                }
            });
            // Configurarea AppBarConfiguration cu drawer-ul și fragmentele
            mAppBarConfiguration = new AppBarConfiguration.Builder(
                    R.id.nav_home, R.id.nav_menu, R.id.nav_favourite, R.id.nav_my_cart)
                    .setDrawerLayout(drawer)
                    .build();

            // Găsirea NavController-ului și configurarea lui cu ActionBar
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
            NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
            NavigationUI.setupWithNavController(navController, navigationView);
        }



    @Override
        public boolean onCreateOptionsMenu(android.view.Menu menu) {
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }


}
}