package com.davidulloa.examen_2021_05_17.binding;

import androidx.fragment.app.Fragment;

public class FragmentDataBindingComponent implements androidx.databinding.DataBindingComponent {
    private final FragmentBindingAdapters adapters;

    public FragmentDataBindingComponent(Fragment fragment) {
        this.adapters = new FragmentBindingAdapters(fragment);
    }

    public FragmentBindingAdapters getFragmentBindingAdapters() {
        return adapters;
    }

}
