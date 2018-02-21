package com.example.myshezhi;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.yanxuwen.mydrawer.BaseDragLayout;


public class TextDragLayout extends BaseDragLayout {
    ImageView iv_cover;
    public TextDragLayout(Context context) {
        super(context);
    }

    public TextDragLayout(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public TextDragLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onViewStatus(boolean isOpen) {

    }

    @Override
    public void onViewOffset(float mOffset) {
        if(iv_cover!=null){
            iv_cover.setAlpha((float) (mOffset*0.8));
        }
    }

    @Override
    public void initView() {
        setContentView(findViewById(R.id.layout_drag));
        //iv_cover= (ImageView) findViewById(R.id.iv_cover);
    }
}
