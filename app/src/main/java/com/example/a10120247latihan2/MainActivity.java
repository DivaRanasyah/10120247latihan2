package com.example.a10120247latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
// 29-04-2023, NIM:10120247, Diva Putra Ranasyah, IF-6

public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void btnRegister(View view){
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }
    }