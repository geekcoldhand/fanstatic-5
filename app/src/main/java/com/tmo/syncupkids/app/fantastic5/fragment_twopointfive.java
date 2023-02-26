package com.tmo.syncupkids.app.fantastic5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.content.Context;


import androidx.annotation.NonNull;

import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;


import com.tmo.syncupkids.app.fantastic5.databinding.FragmentTwopointfive2Binding;


public class fragment_twopointfive extends Fragment {


    private FragmentTwopointfive2Binding binding;
    private FirstViewModel viewModel;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        viewModel = new ViewModelProvider(this).get(FirstViewModel.class);
        binding = FragmentTwopointfive2Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(fragment_twopointfive.this)
                        .navigate(R.id.action_fragment_twopointfive_to_FirstFragment);
            }

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}