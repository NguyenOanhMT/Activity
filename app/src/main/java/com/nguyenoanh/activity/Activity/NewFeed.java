package com.nguyenoanh.activity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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

    ImageView imvMessage;

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

        ItemNew itemNew1 = new ItemNew (getResources ().getString(R.string.alice),getResources ().getString (R.string.today_03_24_pm),
                getResources ().getString (R.string.content), getResources ().getString (R.string._340_00),
                R.drawable.anh, R.drawable.anh1 );
        ItemNew itemNew2 = new ItemNew (getResources ().getString(R.string.json),getResources ().getString (R.string.today_03_24_pm),
                null,  getResources ().getString (R.string._340_00),
                R.drawable.anh, R.drawable.anh1 );
        ItemNew itemNew3 = new ItemNew (getResources ().getString(R.string.martin_palmer),getResources ().getString (R.string.today_03_24_pm),
                null, getResources ().getString (R.string._340_00),
                R.drawable.anh, 0 );

        listNew.add(itemNew1);
        listNew.add(itemNew2);
        listNew.add(itemNew3);
        listNew.add(itemNew2);
        listNew.add(itemNew1);
        
        adapter = new ItemNewAdapter (getApplicationContext (), listNew);
        recyclerView.setAdapter (adapter);


        imvMessage = (ImageView) findViewById (R.id.imv_message);
        imvMessage.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (NewFeed.this, Message.class);
                intent.addFlags (Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity (intent);
            }
        });

    }
}
