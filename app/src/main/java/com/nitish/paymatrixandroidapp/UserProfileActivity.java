package com.nitish.paymatrixandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class UserProfileActivity extends AppCompatActivity {

    Button button1;
    TextView textview1;
    TextView textView2;
    TextView textview3;
    TextView textView4;
    TextView textView5;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        button1=(Button)findViewById(R.id.button1);
        textview1=(TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
        textview3=(TextView)findViewById(R.id.textView3);
        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        imageView=(ImageView)findViewById(R.id.imageView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"kyc pending",Toast.LENGTH_LONG).show();
            }
        });

    }
}
