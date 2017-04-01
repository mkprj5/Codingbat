/*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
*/
public boolean modThree(int[] nums) {
  int countOdd =0, countEven =0;
  for(int i=0; i<nums.length-2; i++) {
    if(nums[i]%2 == 0 && nums[i+1]%2 == 0 && nums[i+2]%2 ==0) {
      return true;
    }
    
    else if(nums[i]%2 == 1 && nums[i+1]%2 == 1 && nums[i+2]%2 == 1) {
      return true;
    }
    
  }
  return false;
}
