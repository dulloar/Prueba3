package com.davidulloa.examen_2021_05_17.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.davidulloa.examen_2021_05_17.data.local.models.Employee;
import com.davidulloa.examen_2021_05_17.data.remote.response.ResponseData;

import java.util.List;

@Dao
public interface EmployeesDao {

    @Query("SELECT * FROM employee")
    LiveData<List<Employee>> getEmployes();

    @Query("SELECT * FROM employee WHERE id = :id")
    LiveData<List<Employee>> getEmployes(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveEmploye(Employee employee);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveEmployes(Employee ...employee);
}
