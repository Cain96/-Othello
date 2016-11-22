package com.cain_96.othello.core;

import android.support.v4.app.Fragment;

import com.cain_96.othello.MainActivity;


public class BaseFragment extends Fragment {
    private static final String TAG = com.cain_96.othello.core.BaseFragment.class.getSimpleName();
    private final com.cain_96.othello.core.BaseFragment self = this;

    public void replaceFragment(com.cain_96.othello.core.BaseFragment fragment, boolean recordBackstack) {
        getMainActivity().replaceFragment(fragment, recordBackstack);
    }

    public void popFragment() {
        getMainActivity().popFragment();
    }

    public MainActivity getMainActivity() {
        return (MainActivity) getActivity();
    }
}
