package com.nguyenoanh.activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nguyenoanh.activity.Adapter.ItemUserAdapter;
import com.nguyenoanh.activity.Model.ItemUser;
import com.nguyenoanh.activity.R;

import java.util.ArrayList;

public class Message extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ItemUser> listUser;

    ItemUserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_message);

        recyclerView = (RecyclerView) findViewById (R.id.recycler_view_message);
        recyclerView.setHasFixedSize (true);
        LinearLayoutManager layoutManager = new LinearLayoutManager (getApplicationContext ());
        recyclerView.setLayoutManager (layoutManager);

        listUser = new ArrayList<> ();

        ItemUser itemNew1 = new ItemUser ("Alice","What your name?", "2 : 50m PM", "3",
                R.drawable.anh, R.drawable.anh1 , 0 );
        ItemUser itemNew2 = new ItemUser ("Alice","What your name?", "2 : 50m PM", "3",
                R.drawable.anh, R.drawable.anh1 , 0 );
        ItemUser itemNew3 = new ItemUser ("Alice","What your name?", "2 : 50m PM", "3",
                R.drawable.anh, R.drawable.anh1 , 0 );

        listUser.add(itemNew1);
        listUser.add(itemNew2);
        listUser.add(itemNew3);
        listUser.add(itemNew2);
        listUser.add(itemNew1);

        adapter = new ItemUserAdapter (getApplicationContext (), listUser);
        recyclerView.setAdapter (adapter);

    }
}
