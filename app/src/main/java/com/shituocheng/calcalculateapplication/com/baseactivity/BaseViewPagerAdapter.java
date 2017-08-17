package com.shituocheng.calcalculateapplication.com.baseactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shituocheng on 2017/8/17.
 */

public class BaseViewPagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private List<Integer> pageIndex = new ArrayList<>();

    public BaseViewPagerAdapter(FragmentManager manager, List indexList) {
        super(manager);
        this.pageIndex = indexList;
    }

    public BaseViewPagerAdapter(FragmentManager manager) {
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

    public void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);
    }

    public void addFragment(Fragment fragment, int index){
        mFragmentList.add(index, fragment);
    }

    public void removeAllFragment(){

        mFragmentList.clear();
    }

    public void removeFragmentAtIndex(int position){

        mFragmentList.remove(position);
    }

    @Override
    public int getItemPosition(Object object) {

        return PagerAdapter.POSITION_NONE;
    }
}
