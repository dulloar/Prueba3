package com.davidulloa.examen_2021_05_17.di;

import android.app.Application;

import com.davidulloa.examen_2021_05_17.ExamenApp;
import com.davidulloa.examen_2021_05_17.app.MyApp;
import com.davidulloa.examen_2021_05_17.ui.EmployeActivity;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class,
                        AppModule.class
                        ,MainActivityModule.class
                        , EmployeActivityModule.class
                        })
public interface AppComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(ExamenApp myApp);
}
