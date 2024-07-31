package com.example.secb2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class loginpage extends AppCompatActivity {
    Button btn1,btn2;
    TextView txt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginpage);
        btn1=findViewById(R.id.btn_login1);
        btn2=findViewById(R.id.btn_signup1);
        txt1=findViewById(R.id.txt_logforgotpassword);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn1Intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(btn1Intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn1Intent = new Intent(getApplicationContext(), signuppage.class);
                startActivity(btn1Intent);
            }
        });
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt1Intent =new Intent(getApplicationContext(), forgotpassword.class);
                startActivity(txt1Intent);
            }
        });
    }
}