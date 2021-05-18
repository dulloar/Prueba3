package com.davidulloa.examen_2021_05_17.di;

import android.app.Application;

import androidx.room.Room;

import com.davidulloa.examen_2021_05_17.api.ExamenService;
import com.davidulloa.examen_2021_05_17.data.local.RoomDatabseEmployes;
import com.davidulloa.examen_2021_05_17.data.local.dao.EmployeesDao;
import com.davidulloa.examen_2021_05_17.data.remote.ApiConstants;
import com.davidulloa.examen_2021_05_17.util.LiveDataCallAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = ViewModelModule.class)
public class AppModule {

    @Singleton
    @Provides
    ExamenService provideIncidenciaService(){


        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
        return new Retrofit.Builder()
                .baseUrl(ApiConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(new LiveDataCallAdapterFactory())
                .build()
                .create(ExamenService.class);
    }



    @Singleton
    @Provides
    RoomDatabseEmployes provideDB(Application app){
        return Room.databaseBuilder(app, RoomDatabseEmployes.class,"employess_db").build();
    }


    @Singleton
    @Provides
    EmployeesDao providesFotoResponse(RoomDatabseEmployes db){return db.getEmployeeDao()}

}
