package com.ryadar.kotlinpractice;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class AvatarView extends AppCompatImageView {


    public AvatarView(Context context) {
        super(context);
    }

    public AvatarView(Context context, AttributeSet attrs) {
        super(context, attrs);

        //getAttributes(attrs);
       // init();
    }

    public AvatarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

     //   getAttributes(attrs);
   //     init();
    }

    private void getAttributes(AttributeSet attrs) {
//        TypedArray a = getContext().getTheme().obtainStyledAttributes(
//                attrs,
//                R.styleable.AvatarView,
//                0, 0);
//
//        try {
//
//            /*
//             * Get the shape and set shape field accordingly
//             * */
//            String avatarShape = a.getString(R.styleable.AvatarView_avatar_shape);
//
//            /*
//             * If the attribute is not specified, consider circle shape
//             * */
//            if (avatarShape == null) {
//                shape = CIRCLE;
//            } else {
//                if (getContext().getString(R.string.rectangle).equals(avatarShape)) {
//                    shape = RECTANGLE;
//                } else {
//                    shape = CIRCLE;
//                }
//            }
//        } finally {
//            a.recycle();
//        }
    }

    /*
     * Initialize fields
     * */

}
