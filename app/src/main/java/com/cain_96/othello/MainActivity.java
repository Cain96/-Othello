package com.cain_96.othello;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.cain_96.othello.View.ReversView;
import com.cain_96.othello.core.BaseFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        LinearLayout l = new LinearLayout(this);
        setContentView(l);

        l.addView(new ReversView(this));

//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.add(R.id.container, new MainFragment());
//        transaction.commit();
    }

    public void replaceFragment(BaseFragment fragment, boolean stack) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        if (stack) {
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }

    public void addFragment(BaseFragment fragment, boolean stack) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragment);
        if (stack) {
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }

    public void popFragment() {
        FragmentManager manager = getSupportFragmentManager();
        manager.popBackStack();
    }
}
