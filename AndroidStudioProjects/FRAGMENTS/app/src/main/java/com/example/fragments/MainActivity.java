package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.example.fragments.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG","create onCreate");
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new HomeFragment());
        Log.d("TAG","do replaceFragment");


        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            if(item.getItemId() == R.id.home){
                Log.d("TAG","do R.id.home");
                replaceFragment(new HomeFragment());
            }else if(item.getItemId() == R.id.profile){
                Log.d("TAG","do R.id.profile");
               replaceFragment(new ProfileFragment());
            }else if(item.getItemId() == R.id.settings){
                Log.d("TAG","do R.id.settings");
               replaceFragment(new SettingsFragment());
            }

        return true;
        });
    }
    private void replaceFragment(Fragment fragment){
        Log.d("TAG","create replaceFragment");
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
        Log.d("TAG","finish fragment commit");
    }
}