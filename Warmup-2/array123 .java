/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/
public boolean array123(int[] nums) {
  if (nums.length < 3 ) {
    return false;
  }
  boolean one = false;
  boolean two = false;
  boolean three = false;
  
  for(int i=0; i < nums.length; i++) {
    if(nums[i] == 1) {
      one =true;
    }
    if(nums[i] == 2) {
      two =true;
    }
    if(nums[i] == 3) {
      three =true;
    }
  }
  return (one && two && three);
}
