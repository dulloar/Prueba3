package com.davidulloa.examen_2021_05_17.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.davidulloa.examen_2021_05_17.R;
import com.davidulloa.examen_2021_05_17.databinding.ActivityEmployeBinding;
import com.davidulloa.examen_2021_05_17.di.Injectable;
import com.davidulloa.examen_2021_05_17.ui.list.ListFragment;
import com.davidulloa.examen_2021_05_17.ui.map.MapsFragment;
import com.davidulloa.examen_2021_05_17.ui.register.RegisterEmployeFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class EmployeActivity extends AppCompatActivity implements HasSupportFragmentInjector, Injectable {

    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector;


    private ActivityEmployeBinding employeBinding;
    private int tFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(employeBinding == null){
            employeBinding = DataBindingUtil.setContentView(this,R.layout.activity_employe);
        }

        tFragment = getIntent().getIntExtra("fragment",0);
        Fragment fragment;
        switch (tFragment){
            case 1:
                fragment = new ListFragment();
                break;
            case 2:
                fragment = new MapsFragment();
                break;
            default:
                fragment = new RegisterEmployeFragment();
                break;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.container,
                fragment).commit();

    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return null;
    }
}