package com.san.rajeerasainyam;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;


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
import java.util.Calendar;
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
        setupTabIcons();
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

    private void setupTabIcons() {

        TextView tabJan = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabJan.setText("Jan");
        tabLayout.getTabAt(0).setCustomView(tabJan);

        TextView tabFeb = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabFeb.setText("Feb");
        tabLayout.getTabAt(1).setCustomView(tabFeb);

        TextView tabMar = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabMar.setText("Mar");
        tabLayout.getTabAt(2).setCustomView(tabMar);

        TextView tabApr = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabApr.setText("Apr");
        tabLayout.getTabAt(3).setCustomView(tabApr);

        TextView tabmay = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabmay.setText("May");
        tabLayout.getTabAt(4).setCustomView(tabmay);

        TextView tabjune = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabjune.setText("June");
        tabLayout.getTabAt(5).setCustomView(tabjune);

        TextView tabjuly = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabjuly.setText("Jul");
        tabLayout.getTabAt(6).setCustomView(tabjuly);

        TextView tabaug = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabaug.setText("Aug");
        tabLayout.getTabAt(7).setCustomView(tabaug);

        TextView tabSep = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabSep.setText("Sep");
        tabLayout.getTabAt(8).setCustomView(tabSep);

        TextView tabOct = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOct.setText("Oct");
        tabLayout.getTabAt(9).setCustomView(tabOct);

        TextView tabnov = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabnov.setText("Nov");
        tabLayout.getTabAt(10).setCustomView(tabnov);

        TextView tabDec = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabDec.setText("Dec");
        tabLayout.getTabAt(11).setCustomView(tabDec);

        setCurrentMonthTab();
    }

    private void setCurrentMonthTab() {
        int month=Calendar.getInstance().get(Calendar.MONTH);
        viewPager.setCurrentItem(month);
    }

}
