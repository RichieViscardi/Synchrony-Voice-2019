package com.example.seniordesign;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

/**
 * Generalized Fragment throughout app.
 * Any actions that should persist throughout entire app will live here.
 */
public abstract class BaseFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(getContentView(), container, false);
        return view;
    }

    /**
     * Method to get the layout id from child in order to inflate the layout
     * @return It will return layout id
     */
    protected abstract int getContentView();
}
