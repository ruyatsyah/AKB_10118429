//Tanggal pengerjaan : 6 April 2021
//NIM                : 10118429
//Nama               : Ruyatsyah

package com.example.tugas1_akb_10118429;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_register extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button register = findViewById(R.id.btnRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_register.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}