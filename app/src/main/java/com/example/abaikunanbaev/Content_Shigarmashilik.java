package com.example.abaikunanbaev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Content_Shigarmashilik extends AppCompatActivity {
private int position=0;
private TextView textView,textView2;
private int [] array_of_Shigarma_Content={R.string.Abai_Shigarma_1,R.string.Abai_Shigarma_2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content__shigarmashilik);
        init();
        receiveIntent();
    }

    private void init() {
        textView=findViewById(R.id.Content_Shigarma);
        textView2=findViewById(R.id.Main_shigarmashilik);
    }

    private void receiveIntent(){
        Intent i =getIntent();
        if (i != null) {
            position=i.getIntExtra("position",0);
        }
        textView.setText(array_of_Shigarma_Content[position]);
        switch (position){
            case 0:
                textView2.setText("Көзімнің қарасы");
                break;
            case 1:
                textView2.setText("Абыралы");
                break;
        }

    }
}









