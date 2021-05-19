package com.davidulloa.examen_2021_05_17.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.davidulloa.examen_2021_05_17.ui.viewmodel.EmployeViewModel;
import com.davidulloa.examen_2021_05_17.viewModel.EmployesViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
abstract class ViewModelModule {

    @SuppressWarnings("unused")
    @Binds
    @IntoMap
    @ViewModelKey(EmployeViewModel.class)
    abstract ViewModel bindMovieViewModel(EmployeViewModel employeViewModel);


    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(EmployesViewModelFactory factory);
}
