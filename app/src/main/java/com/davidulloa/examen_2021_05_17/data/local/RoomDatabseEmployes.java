package com.davidulloa.examen_2021_05_17.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.davidulloa.examen_2021_05_17.data.local.dao.EmployeesDao;
import com.davidulloa.examen_2021_05_17.data.local.models.Employee;


@Database(entities = {Employee.class}, version = 1, exportSchema = false)
public abstract class RoomDatabseEmployes extends RoomDatabase {
    public abstract EmployeesDao getEmployeeDao();
}
