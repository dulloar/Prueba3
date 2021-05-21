package com.davidulloa.examen_2021_05_17.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.davidulloa.examen_2021_05_17.R;
import com.davidulloa.examen_2021_05_17.data.local.models.Employee;

import java.util.ArrayList;

public class EmployeeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Employee> employees;
    private ColaboradorOnclick colaboradorOnClick;

    public EmployeeAdapter(Context context, ArrayList<Employee> employees, ColaboradorOnclick colaboradorOnClick) {
        this.context = context;
        this.employees = employees;
        this.colaboradorOnClick = colaboradorOnClick;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.employe,parent,false);
            return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ViewHolder viewHolder = (ViewHolder) holder;
            viewHolder.tvNombre.setText(employees.get(position).getName());
            viewHolder.tvContacto.setText(employees.get(position).getMail());
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView tvNombre, tvContacto;
        private ColaboradorOnclick mcolaboradorOnClick;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tv_name);
            tvContacto = itemView.findViewById(R.id.tv_email);
            mcolaboradorOnClick = colaboradorOnClick;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mcolaboradorOnClick.OnClick(employees.get(getAdapterPosition()));
        }
    }


    public interface ColaboradorOnclick{
        void OnClick(Employee medioPago);
    }
}

