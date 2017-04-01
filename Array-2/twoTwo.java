/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
*/
public boolean twoTwo(int[] nums) {
  
  for (int i=0; i<nums.length; i++)
   {
      if (nums[i] != 2)
         continue;
      if (i >= 1 && nums[i-1] == 2)
         continue;
      if (i < (nums.length-1) && nums[i+1] == 2)
         continue;
      return false;
   }
   return true;   
   
}
