package kr.anima.xd.s.myapp2.items;


import android.content.Context;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

/**
 * Created by alfo6-10 on 9/8/2017.
 */

public class FabTest {

    FloatingActionButton btn;
    FloatingActionsMenu menu;


    public FabTest(Context context, FloatingActionsMenu menu, FloatingActionButton btn) {
        this.menu=menu;
        this.btn=btn;
        setSize();
    }

    void setSize(){
        btn.setSize(1);
//        menu.generateLayoutParams();
    }
}
