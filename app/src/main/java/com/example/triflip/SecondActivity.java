package com.example.triflip;

import static com.example.triflip.R.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.triflip.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(layout.activity_second);
        binding= ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragement(new HomeFragment());
//        binding.bottomNavigationView.setOnItemReselectedListener (item -> {
//            switch (item.getItemId()){
//
//
//
//
//
//            }
//            return true;
//        });
    }
    private void replaceFragement(Fragment fragment){
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}