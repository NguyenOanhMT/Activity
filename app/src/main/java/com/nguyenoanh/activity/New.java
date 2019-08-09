package com.nguyenoanh.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class New extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ItemNew> listNew;

    ItemNewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_new);

        listNew = new ArrayList<> ();

        recyclerView = findViewById (R.id.recycler_view_new);
        recyclerView.setHasFixedSize (true);
        LinearLayoutManager layoutManager = new LinearLayoutManager (getApplicationContext ());
        recyclerView.setLayoutManager (layoutManager);

        ItemNew itemNew1 = new ItemNew ("Nang","Today, 2m30 ago", "The recyclerview library adds the RecyclerView class. This class provides support for the RecyclerView widget",
                        "3000$", R.drawable.anh, R.drawable.anh1 );
        ItemNew itemNew2 = new ItemNew ("Nang","Today, 2m30 ago",  "",
                "3000$", R.drawable.anh, R.drawable.anh1 );
        ItemNew itemNew3 = new ItemNew ("Nang","Today, 2m30 ago",  "aaaaaaaaa",
                "3000$", R.drawable.anh, 0 );

        listNew.add(itemNew1);
        listNew.add(itemNew2);
        listNew.add(itemNew3);
        listNew.add(itemNew2);
        listNew.add(itemNew1);

        adapter = new ItemNewAdapter (this, listNew);
        recyclerView.setAdapter (adapter);
    }
}
