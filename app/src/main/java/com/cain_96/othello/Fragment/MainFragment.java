package com.cain_96.othello.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cain_96.othello.R;
import com.cain_96.othello.View.ReversView;
import com.cain_96.othello.core.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Cain96 on 2016/11/21.
 */
public class MainFragment extends BaseFragment {

    @Bind(R.id.board)
    ReversView mBoard;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ButterKnife.bind(this, view);

        return view;
    }
}
