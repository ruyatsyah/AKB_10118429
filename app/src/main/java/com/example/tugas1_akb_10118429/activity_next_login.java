//Tanggal pengerjaan : 7 April 2021
//NIM                : 10118429
//Nama               : Ruyatsyah
package com.example.tugas1_akb_10118429;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_next_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_login);

        Button profil = findViewById(R.id.btnProfil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_next_login.this, activity_profil.class);
                startActivity(intent);
            }
        });
        Button logout = findViewById(R.id.btnLogout);
        logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(activity_next_login.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}