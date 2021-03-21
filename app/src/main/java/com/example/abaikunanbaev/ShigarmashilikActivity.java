package com.example.abaikunanbaev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShigarmashilikActivity extends AppCompatActivity {
private String[] array;
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shigarmashilik);
        init();
        List<String> items=initData();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(ShigarmashilikActivity.this,Content_Shigarmashilik.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }

    private void init() {
        listView = findViewById(R.id.LVShigarmashilik);
        listView = findViewById(R.id.LVShigarmashilik);
        listView = findViewById(R.id.LVShigarmashilik);
        listView = findViewById(R.id.LVShigarmashilik);
    }
    private List<String> initData(){
        List<String> list = new ArrayList<String>();
        list.add("Көзімнің қарасы");
        list.add("Абыралыға");
        return list;
    }


}