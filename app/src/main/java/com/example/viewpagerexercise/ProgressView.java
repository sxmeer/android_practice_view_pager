package com.example.viewpagerexercise;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

public class ProgressView extends ConstraintLayout {
    public ProgressView(Context context) {
        super(context);
        init();
    }

    public ProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    public void init() {
//        int height = this.getHeight();
//        int width = this.getWidth();
        ImageView start = new ImageView(getContext());
        start.setId(View.generateViewId());
        this.addView(start,0);
        ImageView end = new ImageView(getContext());
        end.setId(View.generateViewId());
        this.addView(end,1);
        start.setImageDrawable(getResources().getDrawable(R.drawable.ic_keyboard_arrow_right_black_24dp));
        end.setImageDrawable(getResources().getDrawable(R.drawable.ic_keyboard_arrow_left_black_24dp));
        ConstraintSet set = new ConstraintSet();
        set.clone(this);
        set.connect(start.getId(),ConstraintSet.TOP,this.getId(),ConstraintSet.TOP,18);
        set.connect(start.getId(),ConstraintSet.LEFT,this.getId(),ConstraintSet.LEFT,18);
        set.connect(end.getId(),ConstraintSet.TOP,this.getId(),ConstraintSet.TOP,18);
        set.connect(end.getId(),ConstraintSet.RIGHT,this.getId(),ConstraintSet.RIGHT,18);
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                5
        ));
        view.setBackgroundColor(Color.parseColor("#000000"));
        this.addView(view,2);
        set.connect(view.getId(),ConstraintSet.TOP,this.getId(),ConstraintSet.TOP,100);
        set.applyTo(this);
    }
}
