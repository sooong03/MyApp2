package kr.anima.xd.s.myapp2.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import com.getbase.floatingactionbutton.FloatingActionButton;
import static com.getbase.floatingactionbutton.FloatingActionsMenu.*;

import kr.anima.xd.s.myapp2.R;


/**
 * Created by alfo6-10 on 9/8/2017.
 */

public class MyFloatingActionButton extends FloatingActionButton {

    private int mAddButtonPlusColor;
    private int mAddButtonColorNormal;
    private int mAddButtonColorPressed;
    private int mAddButtonSize;
    private boolean mAddButtonStrokeVisible;
    private int mExpandDirection;
    private int mLabelsStyle;
    private int mLabelsPosition;

    public MyFloatingActionButton(Context context) {
        super(context);
    }

    public MyFloatingActionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public MyFloatingActionButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }


    private void init(Context context, AttributeSet attributeSet) {

        final int color_white= R.color.myColorGreyWhite;

        TypedArray attr=context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionsMenu);
//        TypedArray attr = context.obtainStyledAttributes(attributeSet, com.getbase.floatingactionbutton.R.styleable.FloatingActionsMenu, 0, 0);
//        mAddButtonPlusColor = attr.getColor(com.getbase.floatingactionbutton.R.styleable.FloatingActionsMenu_fab_addButtonPlusIconColor, color_white);
//        mAddButtonColorNormal = attr.getColor(com.getbase.floatingactionbutton.R.styleable.FloatingActionsMenu_fab_addButtonColorNormal, color_white);
//        mAddButtonColorPressed = attr.getColor(com.getbase.floatingactionbutton.R.styleable.FloatingActionsMenu_fab_addButtonColorPressed, color_white);


        mAddButtonPlusColor = attr.getColor(R.styleable.FloatingActionsMenu_fab_addButtonPlusIconColor, android.R.color.white);
        mAddButtonColorNormal = attr.getColor(R.styleable.FloatingActionsMenu_fab_addButtonColorNormal, android.R.color.white);
        mAddButtonColorPressed = attr.getColor(R.styleable.FloatingActionsMenu_fab_addButtonColorPressed, android.R.color.white);

        mAddButtonSize = attr.getInt(R.styleable.FloatingActionsMenu_fab_addButtonSize, FloatingActionButton.SIZE_MINI);
        mAddButtonStrokeVisible = attr.getBoolean(R.styleable.FloatingActionsMenu_fab_addButtonStrokeVisible, false);
        mExpandDirection = attr.getInt(R.styleable.FloatingActionsMenu_fab_expandDirection, EXPAND_UP);
        mLabelsStyle = attr.getResourceId(R.styleable.FloatingActionsMenu_fab_labelStyle, 0);
        mLabelsPosition = attr.getInt(R.styleable.FloatingActionsMenu_fab_labelsPosition, LABELS_ON_LEFT_SIDE);
        attr.recycle();





    }




}
