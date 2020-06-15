package com.example.myapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new Museums();
        }else if (position == 2) {
            return new Districts();
        }else {
            return new arts() ;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.place) ;
        } else if (position == 1) {
            return mContext.getString(R.string.museums);
        } else if (position == 2) {
            return mContext.getString(R.string.cities);
        } else {
            return mContext.getString(R.string.art);
        }
    }
}
