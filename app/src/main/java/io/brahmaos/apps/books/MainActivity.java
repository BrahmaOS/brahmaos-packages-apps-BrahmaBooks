package io.brahmaos.apps.books;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {

    private BottomNavigationBar bottomNavigationBar;
    int lastSelectedPositon = 0;
    private static  String TAG = "Books";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationBar = findViewById(R.id.bottom_nav_bar);
        bottomNavigationBar.setTabSelectedListener(this)
                .setMode(BottomNavigationBar.MODE_FIXED)
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
                .setActiveColor(R.color.tabActive)
                .setInActiveColor(R.color.tabInActive);

        bottomNavigationBar.addItem(new BottomNavigationItem(R.drawable.tab_library, R.string.tab_library))
                .addItem(new BottomNavigationItem(R.drawable.tab_store, R.string.tab_store))
                .addItem(new BottomNavigationItem(R.drawable.tab_me, R.string.tab_me))
                .setFirstSelectedPosition(lastSelectedPositon)
                .initialise();

        bottomNavigationBar.show();

    }

    @Override
    public void onTabSelected(int position) {
        Log.i(TAG, "selected " + position);
    }


    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }
}
