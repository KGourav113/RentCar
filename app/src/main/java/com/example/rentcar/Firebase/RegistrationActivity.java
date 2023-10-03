package com.example.rentcar.Firebase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.rentcar.MainActivity;
import com.example.rentcar.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regstration);
        Button signup = (Button) findViewById(R.id.Registration_Signup);
        Button registration_login = (Button) findViewById(R.id.Registration_Loginnow);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText email = (EditText) findViewById(R.id.Registration_email);
                EditText password = (EditText) findViewById(R.id.Registration_password);
                EditText confirm_password = (EditText) findViewById(R.id.Registration_conformpassword);

                CreateNewUser(email.getText().toString().trim(),password.getText().toString());


            }
        });

        registration_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }


    void CreateNewUser(String Email,String Password){
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        mAuth.createUserWithEmailAndPassword(Email, Password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(RegistrationActivity.this,"Successful",Toast.LENGTH_SHORT).show();
                            Intent  intent = new Intent(RegistrationActivity.this, MainActivity.class);
                            startActivity(intent);

                        } else {
                            Toast.makeText(RegistrationActivity.this,"Entered wrong credentials",Toast.LENGTH_SHORT).show();

                        }
                    }
                });


    }
}
