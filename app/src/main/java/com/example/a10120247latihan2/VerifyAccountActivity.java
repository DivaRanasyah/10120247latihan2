package com.example.a10120247latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

// 29-04-2023, NIM:10120247, Diva Putra Ranasyah, IF-6

public class VerifyAccountActivity extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_verify_account);

            Button veryacc = (Button) findViewById(R.id.veryacc);
            veryacc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(VerifyAccountActivity.this, com.example.a10120247latihan2.HomeActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
