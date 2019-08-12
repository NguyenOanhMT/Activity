package com.nguyenoanh.activity.Activity;

import android.os.Bundle;
import com.nguyenoanh.activity.Adapter.ItemNewAdapter;
import com.nguyenoanh.activity.Model.ItemNew;
import com.nguyenoanh.activity.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewFeed extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ItemNew> listNew;

    ItemNewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_new_feed);

        recyclerView = (RecyclerView) findViewById (R.id.recycler_view_home);

        listNew = new ArrayList<> ();

        recyclerView.setHasFixedSize (true);
        recyclerView.setItemAnimator(new DefaultItemAnimator ());
        LinearLayoutManager layoutManager = new LinearLayoutManager ( getApplicationContext ());
        recyclerView.setLayoutManager (layoutManager);

        ItemNew itemNew1 = new ItemNew ("Alice","Today, 2m30 ago", "The recycler view library adds the RecyclerView class. This class provides support for the RecyclerView widget",
                "$3000", R.drawable.anh, R.drawable.anh1 );
        ItemNew itemNew2 = new ItemNew ("Alice","Today, 2m30 ago",  null,
                "$3000", R.drawable.anh, R.drawable.anh1 );
        ItemNew itemNew3 = new ItemNew ("Alice","Today, 2m30 ago",  null,
                "$3000", R.drawable.anh, R.drawable.anh2 );

        listNew.add(itemNew1);
        listNew.add(itemNew2);
        listNew.add(itemNew3);
        listNew.add(itemNew2);
        listNew.add(itemNew1);

        adapter = new ItemNewAdapter (getApplicationContext (), listNew);
        recyclerView.setAdapter (adapter);
    }
}
