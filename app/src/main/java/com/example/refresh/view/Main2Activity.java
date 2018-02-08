package com.example.refresh.view;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.refresh.R;
import com.facebook.drawee.view.SimpleDraweeView;

import retrofit2.http.Url;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SimpleDraweeView img = findViewById(R.id.img);

        Intent intent = getIntent();
        String key = intent.getStringExtra("key");
        Log.i("xxx",key.toString());
        img.setImageURI(Uri.parse(key));
    }
}
