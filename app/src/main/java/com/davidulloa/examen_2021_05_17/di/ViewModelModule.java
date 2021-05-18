package com.davidulloa.examen_2021_05_17.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.davidulloa.examen.ui.viewmodel.MovieViewModel;
import com.davidulloa.examen.viewmodel.MovieViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
abstract class ViewModelModule {

    @SuppressWarnings("unused")
    @Binds
    @IntoMap
    @ViewModelKey(EmployeViewModel.class)
    abstract ViewModel bindMovieViewModel( movieViewModel);

 /*   @SuppressWarnings("unused")
    @Binds
    @IntoMap
    @ViewModelKey(ImageViewModel.class)
    abstract ViewModel bindImageViewModel(ImageViewModel imageViewModel);*/

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(MovieViewModelFactory factory);
}
