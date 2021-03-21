package com.example.abaikunanbaev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnShigarmashiligiClick(View view) {
        startActivity(new Intent(MainActivity.this,ShigarmashilikActivity.class));
    }

    public void OnKaraSozderiClick(View view) {
    }

    public void OnOmirBaianClick(View view) {
        startActivity(new Intent(MainActivity.this,OmirBaianActivity.class));
    }
}