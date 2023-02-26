package com.tmo.syncupkids.app.fantastic5;


import android.app.Activity;

import android.content.Context;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.tmo.syncupkids.app.fantastic5.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
//        viewModel = new ViewModelProvider(this).get(FirstViewModel.class);
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();


    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }

        });

        binding.radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Is the button now checked?
                boolean checked = ((RadioButton) view).isChecked();


                // Check which radio button was clicked
                switch (view.getId()) {
                    case R.id.radioButton:
                        if (checked) {
                            MainViewModel.rewardsPoints += 5;
                        }

                        break;
                    case R.id.radioButton1:
                        if (checked) {
                            MainViewModel.rewardsPoints += 10;
                        }


                        break;
                    case R.id.radioButton2:
                        if (checked) {
                            MainViewModel.rewardsPoints += 15;
                        }

                        break;
                }
            }

        });

        binding.buttonSecond1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                viewModel.rewardsPoints++;
//                binding.textView2.setText(String.valueOf(viewModel.rewardsPoints));
                ((MainActivity) getActivity()).mainViewModel.rewardsPoints++;
                Vibrator vibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                // Vibrate for 500 milliseconds
                vibrator.vibrate(500);
            }
        });
    }
    public void onCompletedTask(View view) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}