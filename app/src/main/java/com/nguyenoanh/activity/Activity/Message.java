package com.nguyenoanh.activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.nguyenoanh.activity.Adapter.ItemUserAdapter;
import com.nguyenoanh.activity.Model.ItemUser;
import com.nguyenoanh.activity.R;

import java.util.ArrayList;

public class Message extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ItemUser> listUser;

    ItemUserAdapter adapter;

    ImageView imvHome;

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
                R.drawable.anh2, R.color.colorAccent , R.drawable.background_number_mess );
        ItemUser itemNew2 = new ItemUser ("Alex","How old are you?", "2 : 50m PM", null,
                R.drawable.anh1, R.color.colorAccent , 0 );
        ItemUser itemNew3 = new ItemUser ("Json","I wait for school. You remember ... ", "2 : 50m PM", null,
                R.drawable.anh, 0 , 0 );

        listUser.add(itemNew1);
        listUser.add(itemNew2);
        listUser.add(itemNew3);
        listUser.add(itemNew2);
        listUser.add(itemNew1);

        adapter = new ItemUserAdapter (getApplicationContext (), listUser);
        recyclerView.setAdapter (adapter);

        imvHome = (ImageView) findViewById (R.id.imv_home);
        imvHome.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Message.this, NewFeed.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity (intent);
            }
        });
    }
}
