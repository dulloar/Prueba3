package com.davidulloa.examen_2021_05_17;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.davidulloa.examen_2021_05_17.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(binding == null ){
            binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        }
    }
}