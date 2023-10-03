package com.example.rentcar.Firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rentcar.MainActivity;
import com.example.rentcar.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.LoginButton);
        Button login_signup = (Button) findViewById(R.id.Login_singup);
        Button login_google = (Button) findViewById(R.id.Login_google);
        Button login_facebook = (Button) findViewById(R.id.Login_facebook);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Login_email = (EditText) findViewById(R.id.Login_email);
                EditText Login_pass = (EditText) findViewById(R.id.Login_password);
                LoginWithCredentials(Login_email.getText().toString(),Login_pass.getText().toString());
            }
        });

        login_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(intent1);
            }
        });

    }

    void LoginWithCredentials(String Email,String Password){
        FirebaseAuth auth = FirebaseAuth.getInstance();

        auth.signInWithEmailAndPassword(Email, Password)
                .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);

                        } else {
                            Toast.makeText(LoginActivity.this,"Wrong Credentials",Toast.LENGTH_SHORT).show();

                        }
                    }
                });




    }


}