package com.davidulloa.examen_2021_05_17.binding;

import androidx.fragment.app.Fragment;

import javax.inject.Inject;

public class FragmentBindingAdapters {
    final Fragment fragment;

    @Inject
    public FragmentBindingAdapters(Fragment fragment){
        this.fragment = fragment;
    }

}
