package com.davidulloa.examen_2021_05_17.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.davidulloa.examen.data.local.dao.MovieDao;
import com.davidulloa.examen.data.local.models.Movie;

@Database(entities = {Movie.class},version = 1, exportSchema = false)
@TypeConverters({DateConvert.class})
public abstract class MovieRoomDatabase extends RoomDatabase {
    public abstract MovieDao MovieDao();
}
