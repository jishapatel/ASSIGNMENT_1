package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoMainActivity(View v) {
        switch (v.getId()) {
            case R.id.Q1:
                startActivity(new Intent(getApplicationContext(), Q1AdditionActivity.class));
                break;

            case R.id.Q2:
                startActivity(new Intent(getApplicationContext(), Q2LifecycleActivity.class));
                break;

            case R.id.Q3:
                startActivity(new Intent(getApplicationContext(), Q3LoginActivity.class));
                break;

            default:
                break;
        }
    }
}