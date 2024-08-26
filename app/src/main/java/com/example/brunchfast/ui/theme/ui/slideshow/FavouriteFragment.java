package com.example.brunchfast.ui.theme.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.brunchfast.R;
import com.example.brunchfast.databinding.FragmentFavouriteBinding;
import com.example.brunchfast.databinding.FragmentFavouriteBinding;


public class FavouriteFragment extends Fragment {

    private FragmentFavouriteBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_favourite, container, false);

        return root;
    }
}
