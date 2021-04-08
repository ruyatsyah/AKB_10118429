//Tanggal pengerjaan : 8 April 2021
//NIM                : 10118429
//Nama               : Ruyatsyah
package com.example.tugas1_akb_10118429;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_profil extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        Button button = findViewById(R.id.btnKembali);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_profil.this, activity_next_login.class);
                startActivity(intent);
            }
        });
    }
}