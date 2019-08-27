package com.example.tugas5rikii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView samsungrv;
    private ArrayList<samsung21> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        samsungrv = findViewById(R.id.rv_samsung);
        samsungrv.setHasFixedSize(true);

        list.addAll(samsungdata.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        samsungrv.setLayoutManager(new LinearLayoutManager(this));
        samsung22 samsung22= new samsung22(list);
        samsungrv.setAdapter(samsung22);
    }
}
