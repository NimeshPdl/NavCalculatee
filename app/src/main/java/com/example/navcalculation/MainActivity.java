package com.example.navcalculation;

import android.os.Bundle;

import com.example.navcalculation.Fragments.Automorphic;
import com.example.navcalculation.Fragments.Palindrome;
import com.example.navcalculation.Fragments.Sum;
import com.example.navcalculation.Fragments.SwapNumber;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnsum,btnreversenumber,btnpalindrome,btnautomorphicnumber;
    private String status="f1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsum=findViewById(R.id.btnadd);
        btnreversenumber=findViewById(R.id.btnreverseofnumber);
        btnpalindrome=findViewById(R.id.btnpalindrome);
        btnautomorphicnumber=findViewById(R.id.btnautomophic);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Sum sumFragment=new Sum();
                fragmentTransaction.replace(R.id.fragmentcontainer,sumFragment);
                fragmentTransaction.commit();
            }
        });

        btnreversenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                SwapNumber reverseFragment=new SwapNumber();
                fragmentTransaction.replace(R.id.fragmentcontainer,reverseFragment);
                fragmentTransaction.commit();
            }
        });

        btnpalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Palindrome palindromeFragment=new Palindrome();
                fragmentTransaction.replace(R.id.fragmentcontainer,palindromeFragment);
                fragmentTransaction.commit();
            }
        });

        btnautomorphicnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Automorphic automorphicFragment=new Automorphic();
                fragmentTransaction.replace(R.id.fragmentcontainer,automorphicFragment);
                fragmentTransaction.commit();
            }
        });

    }


}
