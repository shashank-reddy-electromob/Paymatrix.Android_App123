package com.nitish.paymatrixandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {

    private ViewPager loginPager;
    private LoginPagerAdapter loginAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginPager=findViewById(R.id.login_pager);
        loginAdapter=new LoginPagerAdapter(getSupportFragmentManager(),0);
        loginPager.setAdapter(loginAdapter);

        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(loginPager);
    }
    public void login(View v){
        Intent i=new Intent(this,UserDashboardActivity.class);
        startActivity(i);
    }
}
