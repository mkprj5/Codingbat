/*
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
*/
public int[] makeEnds(int[] nums) {
  int[] n = new int[2];
  if(nums.length >= 2) {
   n[0] = nums[0];
   n[1] = nums[nums.length-1];
  }
  else {
  n[0] = n[1] = nums[0];
  }
  return n;
 
}
