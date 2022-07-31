package com.example.baseproject.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.baseproject.R;
import com.example.baseproject.databinding.ActivityStudentHomeBinding;
import com.example.baseproject.viewmodel.StudentHomeViewModel;

public class StudentHomeActivity extends AppCompatActivity {

    private static final String TAG = "StudentHomeActivity";
    private StudentHomeViewModel mStudentHomeViewModel;
    private ActivityStudentHomeBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_student_home);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_student_home);
        mStudentHomeViewModel = new ViewModelProvider(this).get(StudentHomeViewModel.class);
        mBinding.setViewModel(mStudentHomeViewModel);
        mBinding.setLifecycleOwner(this);
    }
}