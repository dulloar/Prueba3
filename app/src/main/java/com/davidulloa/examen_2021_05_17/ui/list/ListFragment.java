package com.davidulloa.examen_2021_05_17.ui.list;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.davidulloa.examen_2021_05_17.R;
import com.davidulloa.examen_2021_05_17.binding.FragmentDataBindingComponent;
import com.davidulloa.examen_2021_05_17.data.local.models.Employee;
import com.davidulloa.examen_2021_05_17.databinding.FragmentListBinding;
import com.davidulloa.examen_2021_05_17.di.Injectable;
import com.davidulloa.examen_2021_05_17.ui.adapter.EmployeeAdapter;
import com.davidulloa.examen_2021_05_17.ui.common.NavigationFragment;
import com.davidulloa.examen_2021_05_17.util.AutoClearedValue;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment implements Injectable {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private EmployeeAdapter.ColaboradorOnclick colaboradorOnClick;
    private RecyclerView recyclerView;

    androidx.databinding.DataBindingComponent dataBindingComponent = new FragmentDataBindingComponent(this);

    AutoClearedValue<FragmentListBinding> binding;
    AutoClearedValue<EmployeeAdapter> adapter;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    @Inject
    NavigationFragment navigationFragment;

    public ListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BottonFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentListBinding dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_list,
                container, false, dataBindingComponent);
        binding = new AutoClearedValue<>(this,dataBinding);

        ArrayList<Employee> colaboradores = new ArrayList<>();
        colaboradores.add(new Employee(1,"Pako","Pako@mail.com"));
        colaboradores.add(new Employee(2,"Pedro","Pedro@mail.com"));
        colaboradores.add(new Employee(3,"Alejandra","Alejandra@mail.com"));
        colaboradores.add(new Employee(4,"Laura","Laura@mail.com"));

        EmployeeAdapter adapter = new EmployeeAdapter(getContext(), colaboradores, new EmployeeAdapter.ColaboradorOnclick() {
            @Override
            public void OnClick(Employee employee) {
                navigationFragment.navigateMaps(employee.getId());
            }
        });
        binding.get().rvEmployee.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.get().rvEmployee.setAdapter(adapter);
        // Inflate the layout for this fragment
        return dataBinding.getRoot();
    }
}