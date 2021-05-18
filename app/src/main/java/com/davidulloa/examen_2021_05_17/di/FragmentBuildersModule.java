package com.davidulloa.examen_2021_05_17.di;


import com.davidulloa.examen.ui.dashboard.DashboardFragment;
import com.davidulloa.examen.ui.file.FilesFragment;
import com.davidulloa.examen.ui.home.HomeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract HomeFragment contributeHomeFragment();

    @ContributesAndroidInjector
    abstract DashboardFragment contributeDashboardFragment();

    @ContributesAndroidInjector
    abstract FilesFragment contributeNotificacionFragment();

}
