package com.phoenix.sebas.shrinkquizz.Views.Tabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phoenix.sebas.shrinkquizz.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class LukyFragment extends Fragment {


    public LukyFragment() {
        // Required empty public constructor
    }
public static LukyFragment newInstance()    {
    return new LukyFragment();
}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_luky, container, false);
    }

}
