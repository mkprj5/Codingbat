/*
Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.

swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
*/
public int[] swapEnds(int[] nums) {
  if(nums.length>1) {
  nums[nums.length-1] = nums[0] + nums[nums.length-1];
  nums[0] = nums[nums.length-1] - nums[0];
  nums[nums.length-1] = nums[nums.length-1] - nums[0];
  }

  
  return nums;
}
