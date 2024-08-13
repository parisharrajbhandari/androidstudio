package com.example.secb2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgotpassword extends AppCompatActivity {
    Button btn1;
    TextView txt1,txt2,txt3,txt_email;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forgotpassword);
        btn1=findViewById(R.id.btn_getemail);
        txt1=findViewById(R.id.txt_about);
        txt2=findViewById(R.id.txt_help);
        txt3=findViewById(R.id.txt_more);
        txt_email=findViewById(R.id.txt_email);
        firebaseAuth=FirebaseAuth.getInstance();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email=txt_email.getText().toString().trim();
                if (Email.isEmpty()){
                    Toast.makeText(forgotpassword.this, "Enter Email First", Toast.LENGTH_SHORT).show();
                }
                firebaseAuth.sendPasswordResetEmail(Email).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(forgotpassword.this, "Please Check Email", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }
                });
            }
        });

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt1Intent= new Intent(getApplicationContext(), about.class);
                startActivity(txt1Intent);
            }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt2Intent= new Intent(getApplicationContext(), about.class);
                startActivity(txt2Intent);
            }
        });

        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt3Intent= new Intent(getApplicationContext(), more.class);
                startActivity(txt3Intent);
            }
        });

    }
}