package com.tmo.syncupkids.app.fantastic5;

import android.view.View;

import androidx.lifecycle.ViewModel;
import androidx.navigation.fragment.NavHostFragment;

public class FirstViewModel extends ViewModel {
   public int rewardsPoints = 0;

   public void setRewardsPoints(int newVal) {
      rewardsPoints = newVal;
   }




}
