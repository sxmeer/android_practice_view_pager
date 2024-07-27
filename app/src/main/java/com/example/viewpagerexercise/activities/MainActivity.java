package com.example.viewpagerexercise.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.viewpagerexercise.R;
import com.example.viewpagerexercise.fragments.ScreenOne;
import com.example.viewpagerexercise.fragments.ScreenTwo;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final int NUM_PAGES = 2;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FragmentStatePagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instantiate a ViewPager2 and a PagerAdapter.
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tab_layout);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position==0)
                return new ScreenOne();
            return new ScreenTwo();
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            if (position==0)
                return "Screen one";
            return "Screen Two";
        }
    }
}

