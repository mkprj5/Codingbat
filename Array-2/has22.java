/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
*/
public boolean has22(int[] nums) {
  int fl=0;
  for(int i=0; i < nums.length; i++) {
    if(nums[i] == 2 && i+1 < nums.length && nums[i+1] == 2) {
      return true;
    }
    else {
      fl=0;
    }
  }
  return (fl==1);
}
