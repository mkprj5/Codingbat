/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
*/
public boolean haveThree(int[] nums) {
  int countThree = 0;
  if(nums.length > 1 && nums[0] == 3 && nums[1]!=3) countThree++;
  for(int i=1; i < nums.length; i++) {
    
    if(nums[i] ==3 && nums[i-1] != 3) {
      countThree++;
    }
  }
  
  return (countThree  == 3);

  
}
