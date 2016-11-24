package test.li.com.test;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Fragment aFragment = AFragment.getInstance();
    Fragment bFragment = BFragment.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTabLayout();
        initFragment();
    }

    private void initFragment() {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, aFragment);
        fragmentTransaction.commit();
    }

    private void initTabLayout() {
        TabLayout tabLayout = (TabLayout) findViewById(R.id.mainActivity_tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("FEEDBACK"));
        tabLayout.addTab(tabLayout.newTab().setText("RETURN POLICY"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }

}
