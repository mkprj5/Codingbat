/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
*/
public boolean no14(int[] nums) {
  boolean ones = false, fours = false;

  for(int i=0; i < nums.length; i++) {
    if(nums[i] == 1) {
      ones = true;
    }
    else if(nums[i] == 4) {
      fours = true;
    }
  }
  return(ones == false || fours == false);
  
}
