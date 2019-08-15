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


        ItemUser itemUser1 = new ItemUser (getResources ().getString (R.string.martin_palmer),getResources ().getString(R.string.what_your_name),
                getResources ().getString (R.string._5_45_pm), getResources ().getString(R.string._3),
                R.drawable.anh2, R.color.colorAccent , R.drawable.background_number_mess );
        ItemUser itemUser2 = new ItemUser (getResources ().getString(R.string.alex),getResources ().getString(R.string.how_old_are_you),
                getResources ().getString (R.string._5_45_pm), null,
                R.drawable.anh1, R.color.colorAccent , 0 );
        ItemUser itemUser3 = new ItemUser (getResources ().getString(R.string.json),getResources ().getString(R.string.i_wait),
                getResources ().getString (R.string._5_45_pm), null,
                R.drawable.anh, 0 , 0 );

        listUser.add(itemUser1);
        listUser.add(itemUser2);
        listUser.add(itemUser3);
        listUser.add(itemUser2);
        listUser.add(itemUser1);

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
