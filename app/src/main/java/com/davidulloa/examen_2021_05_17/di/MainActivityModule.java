package com.davidulloa.examen_2021_05_17.di;



import com.davidulloa.examen_2021_05_17.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {
    abstract MainActivity contributeMaibnActivity();
}
