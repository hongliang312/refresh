package com.example.myshezhi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

import com.yanxuwen.mydrawer.BaseDragLayout;

public class MainActivity extends AppCompatActivity {


    private TextDragLayout mTextDragLayout3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mTextDragLayout3 = findViewById(R.id.includ_text_drag3);

        mTextDragLayout3.setOnDragViewStatusListener(new BaseDragLayout.OnDragViewStatusListener() {
            @Override
            public void onDragViewStatus(boolean isOpen) {
                Log.e("xxxx","底边抽屉是否打开"+isOpen);
            }
        });
        mTextDragLayout3.setOnDragViewOffsetListener(new BaseDragLayout.OnDragViewOffsetListener() {
            @Override
            public void onDragViewOffset(float Offset) {
                Log.e("xxxx","底边抽屉偏移量"+Offset);
            }
        });

    }
    public  void onFullBottom(View view){

        mTextDragLayout3.open();

    }
}
