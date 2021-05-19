package com.davidulloa.examen_2021_05_17.binding;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class ActivityBindingAdapters {
    final AppCompatActivity activity;

    @Inject
    public ActivityBindingAdapters(AppCompatActivity activity){
        this.activity = activity;
    }


}
