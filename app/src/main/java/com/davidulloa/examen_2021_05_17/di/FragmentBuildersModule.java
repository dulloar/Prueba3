package com.davidulloa.examen_2021_05_17.di;



import com.davidulloa.examen_2021_05_17.ui.list.ListFragment;
import com.davidulloa.examen_2021_05_17.ui.map.MapsFragment;
import com.davidulloa.examen_2021_05_17.ui.register.RegisterEmployeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ListFragment contributeListFragment();

    @ContributesAndroidInjector
    abstract MapsFragment contributeMapsFragment();

    @ContributesAndroidInjector
    abstract RegisterEmployeFragment contributeRegisterFragment();

}
