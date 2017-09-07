package kr.anima.xd.s.myapp2.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import kr.anima.xd.s.myapp2.cloud.CloudFragment;
import kr.anima.xd.s.myapp2.dashboard.DashboardFragment;
import kr.anima.xd.s.myapp2.inventory.InventoryFragment;
import kr.anima.xd.s.myapp2.R;

import static kr.anima.xd.s.myapp2.items.NameOfItem.*;

public class MainActivity extends AppCompatActivity {

    private Fragment[] pages=new Fragment[3];
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menu_cloud:
                    getSupportFragmentManager().beginTransaction().replace(R.id.FL_Container, pages[PAGE_CLOUD]).commit();
                    return true;
                case R.id.menu_dashboard:
                    getSupportFragmentManager().beginTransaction().replace(R.id.FL_Container, pages[PAGE_DASHBOARD]).commit();
                    return true;
                case R.id.menu_inventory:
                    getSupportFragmentManager().beginTransaction().replace(R.id.FL_Container, pages[PAGE_INVENTORY]).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragment();
        
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.menu_dashboard);

    }

    private void initFragment(){
        pages[PAGE_DASHBOARD]=new DashboardFragment(this);
        pages[PAGE_CLOUD]=new CloudFragment();
        pages[PAGE_INVENTORY]=new InventoryFragment();
    }

}
