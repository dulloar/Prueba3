package com.davidulloa.examen_2021_05_17.ui.common;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ListFragment;

import com.davidulloa.examen_2021_05_17.R;
import com.davidulloa.examen_2021_05_17.ui.EmployeActivity;
import com.davidulloa.examen_2021_05_17.ui.map.MapsFragment;
import com.davidulloa.examen_2021_05_17.ui.register.RegisterEmployeFragment;

import javax.inject.Inject;

public class NavigationFragment {
    private final int containerId;
    private final FragmentManager fragmentManager;

    @Inject
    public NavigationFragment(EmployeActivity employeActivity){
        this.containerId = R.id.container;
        this.fragmentManager = employeActivity.getSupportFragmentManager();
    }

    public void navigateHome(){
        ListFragment listFragment = new ListFragment();
        fragmentManager.beginTransaction()
                .replace(containerId, listFragment)
                .commit();
    }

    public void navigateMaps(int id){
        MapsFragment mapsFragment = new MapsFragment().newInstance(id);
        fragmentManager.beginTransaction()
                .replace(containerId, mapsFragment,"maps")
                .commit();
    }
    public void navigateRegister(){
        RegisterEmployeFragment registerEmployeFragment = new RegisterEmployeFragment();
        fragmentManager.beginTransaction()
                .replace(containerId, registerEmployeFragment,"register")
                .commit();
    }

}
