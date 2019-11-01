package com.san.rajeerasainyam;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;
import com.san.rajeerasainyam.months.AprFragment;
import com.san.rajeerasainyam.months.AugFragment;
import com.san.rajeerasainyam.months.DecFragment;
import com.san.rajeerasainyam.months.FebFragment;
import com.san.rajeerasainyam.months.JanFragment;
import com.san.rajeerasainyam.months.JulyFragment;
import com.san.rajeerasainyam.months.JuneFragment;
import com.san.rajeerasainyam.months.MarFragment;
import com.san.rajeerasainyam.months.MayFragment;
import com.san.rajeerasainyam.months.NovFragment;
import com.san.rajeerasainyam.months.OctFragment;
import com.san.rajeerasainyam.months.SepFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new JanFragment(), "JAN");
        adapter.addFrag(new FebFragment(), "FEB");
        adapter.addFrag(new MarFragment(), "MAR");
        adapter.addFrag(new AprFragment(), "APR");
        adapter.addFrag(new MayFragment(), "MAY");
        adapter.addFrag(new JuneFragment(), "JUNE");
        adapter.addFrag(new JulyFragment(), "JULY");
        adapter.addFrag(new AugFragment(), "AUG");
        adapter.addFrag(new SepFragment(), "SEP");
        adapter.addFrag(new OctFragment(), "OCT");
        adapter.addFrag(new NovFragment(), "NOV");
        adapter.addFrag(new DecFragment(), "DEC");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
