package com.davidulloa.examen_2021_05_17.di;

import com.davidulloa.examen_2021_05_17.MainActivity;
import com.davidulloa.examen_2021_05_17.ui.EmployeActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class EmployeActivityModule {
    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract EmployeActivity contributeEmployeeActivity();
}
