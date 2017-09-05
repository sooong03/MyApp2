package kr.anima.xd.s.myapp2.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import kr.anima.xd.s.myapp2.CloudFragment;
import kr.anima.xd.s.myapp2.DashboardFragment;
import kr.anima.xd.s.myapp2.InventoryFragment;
import kr.anima.xd.s.myapp2.R;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menu_cloud:
                    getSupportFragmentManager().beginTransaction().replace(R.id.FL_Container, new CloudFragment()).commit();
                    return true;
                case R.id.menu_dashboard:
                    getSupportFragmentManager().beginTransaction().replace(R.id.FL_Container, new DashboardFragment()).commit();
                    return true;
                case R.id.menu_inventory:
                    getSupportFragmentManager().beginTransaction().replace(R.id.FL_Container, new InventoryFragment()).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setSelectedItemId(R.id.menu_dashboard);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

}
