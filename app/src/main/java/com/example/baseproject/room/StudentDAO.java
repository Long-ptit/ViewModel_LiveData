package com.example.baseproject.room;

import android.content.ContentProvider;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDAO {

    @Insert
    void insertStudent(Student student);

    @Query(value = "SELECT * from tbl_student")
    LiveData<List<Student>> getAllStudents();
}
