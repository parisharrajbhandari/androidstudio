package com.example.secb2;

import static java.lang.Thread.sleep;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent=new Intent(getApplicationContext(), loginpage.class);
                    startActivity(intent);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                }

        });
        thread.start();
    }
}