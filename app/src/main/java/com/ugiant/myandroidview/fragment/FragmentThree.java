package com.ugiant.myandroidview.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ugiant.myandroidview.R;

public class FragmentThree extends Fragment {



    public FragmentThree() {

    }


    // TODO: Rename and change types and number of parameters
    public static FragmentThree newInstance() {
        FragmentThree fragment = new FragmentThree();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_three, container, false);
    }

}
