package com.example.baseproject.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.baseproject.R;
import com.example.baseproject.room.MyDataBase;
import com.example.baseproject.room.Student;
import com.example.baseproject.room.StudentDAO;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "ptit";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		getData();
	}

}