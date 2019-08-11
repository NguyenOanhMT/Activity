package com.nguyenoanh.activity.Activity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.nguyenoanh.activity.Fragment.HomeFragment;
import com.nguyenoanh.activity.Fragment.MessageFragment;
import com.nguyenoanh.activity.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class NewFeed extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener () {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectFragment = null;
            switch (item.getItemId ()) {
                case R.id.icon_home:
                    selectFragment = new HomeFragment ();
                    break;
                case R.id.icon_message:
                    selectFragment = new MessageFragment ();
                    break;
                case R.id.icon_plus:
                    mTextMessage.setText (R.string.title_notifications);
                    break;
                case R.id.icon_ring:
                    mTextMessage.setText (R.string.title_notifications);
                    break;
                case R.id.icon_profile:
                    mTextMessage.setText (R.string.title_notifications);
                    break;
            }
            getSupportFragmentManager ().beginTransaction ().replace (R.id.fragment_container,
                    selectFragment);
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_new_feed);

        BottomNavigationView bottomNav = findViewById (R.id.navigation);
        Menu a = bottomNav.getMenu();
        MenuItem b = a.findItem(R.id.imv_profile);


        bottomNav.setOnNavigationItemSelectedListener (mOnNavigationItemSelectedListener);

        getSupportFragmentManager ().beginTransaction ().replace (R.id.fragment_container,
                new HomeFragment ()).commit ();

    }

}
