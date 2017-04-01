/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
*/
public int[] zeroFront(int[] nums) {
  
  if(nums.length<1) {
    return nums;
  } 
  Arrays.sort(nums);
  if(nums[0] < 0) {
    int[] n = new int[nums.length];
    int l = Arrays.binarySearch(nums, 0);
    //int l = Arrays.indexOf(nums, 0);
    for(int i=0, j=l; i < nums.length; i++, j++) {
      
      n[i] = nums[j];
      if(j == nums.length-1) {
        j=-1; 
      }
    }
    
    return n;
  }
  else {
    return nums;
  }
  
}
