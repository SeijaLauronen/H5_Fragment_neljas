package com.example.ssl_h5_frag_4th;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //youtube.com/watch?v=iksjcQuxtt4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment =new FirstFragment();
        FragmentManager manager =getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.firstLayout, firstFragment, firstFragment.getTag())
                .commit();


        SecondFragment secondFragment =new SecondFragment();
        manager.beginTransaction()
                .replace(R.id.secondLayout, secondFragment, secondFragment.getTag())
                .commit();

    }
}
