package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class Q3LoginActivity extends AppCompatActivity {

    EditText username,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3_login);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Objects.equals(username.getText().toString(), "admin")&&Objects.equals(password.getText().toString(),"admin"))
                {
                    Toast.makeText(Q3LoginActivity.this,"You have Authenticated Successfully", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Q3LoginActivity.this,Q3SecondActivity.class);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(Q3LoginActivity.this,"Authentication Failed",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}