package com.example.rentcar.Firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rentcar.R;

public class InitialScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_screen2);


        Button login = (Button) findViewById(R.id.LoginButton);
        Button signup = (Button) findViewById(R.id.signupButton);



      login.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(InitialScreen.this, LoginActivity.class);
              startActivity(intent);

          }
      });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InitialScreen.this, RegistrationActivity.class);
                startActivity(intent);

            }
        });





    }
}