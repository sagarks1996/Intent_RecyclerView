package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelClass> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview_id);

        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));
        arrayList.add(new ModelClass("text1",R.drawable.image));

        CustomAdapter adapter = new CustomAdapter(MainActivity.this,arrayList);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
