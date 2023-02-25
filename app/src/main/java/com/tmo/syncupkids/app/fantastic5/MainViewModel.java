package com.tmo.syncupkids.app.fantastic5;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
   public int rewardsPoints = 0;
   public Tasks task1 = new Tasks("Sweep", 0, false, 5);
   public Tasks task2 = new Tasks("Dishes", 1, false, 5);
   public Tasks task3 = new Tasks("Cleaning", 2, false, 5);


   public void setRewardsPoints(int newVal) {
      rewardsPoints = newVal;
   }


}
