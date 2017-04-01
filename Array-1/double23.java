  /*
  Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
*/
public boolean double23(int[] nums) {
  int[] o = {2,2};
  int[] t = {3,3};
  
  if((Arrays.equals(nums,o)) || (Arrays.equals(nums,t))) {
    return true;
  }
  
  return false;
}
