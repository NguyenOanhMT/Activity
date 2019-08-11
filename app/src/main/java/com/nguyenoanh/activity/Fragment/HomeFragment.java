package com.nguyenoanh.activity.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nguyenoanh.activity.Model.ItemNew;
import com.nguyenoanh.activity.Adapter.ItemNewAdapter;
import com.nguyenoanh.activity.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<ItemNew> listNew;

    ItemNewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate (R.layout.fragment_home, container, false);


        recyclerView = view.findViewById (R.id.recycler_view_new);
        recyclerView.setHasFixedSize (true);
        LinearLayoutManager layoutManager = new LinearLayoutManager (getContext ());
        recyclerView.setLayoutManager (layoutManager);

        listNew = new ArrayList<> ();

        ItemNew itemNew1 = new ItemNew ("Nang","Today, 2m30 ago", "The recycler view library adds the RecyclerView class. This class provides support for the RecyclerView widget",
                "$3000", R.drawable.anh, R.drawable.anh1 );
        ItemNew itemNew2 = new ItemNew ("Nang","Today, 2m30 ago",  "",
                "3000$", R.drawable.anh, R.drawable.anh1 );
        ItemNew itemNew3 = new ItemNew ("Nang","Today, 2m30 ago",  "",
                "3000$", R.drawable.anh, R.drawable.anh2 );

        listNew.add(itemNew1);
        listNew.add(itemNew2);
        listNew.add(itemNew3);
        listNew.add(itemNew2);
        listNew.add(itemNew1);

        adapter = new ItemNewAdapter (getContext (), listNew);
        recyclerView.setAdapter (adapter);

        return view;
    }
}
