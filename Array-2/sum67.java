/*
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
*/
public int sum67(int[] nums) {
  int sum=0;
  for(int i=0; i < nums.length; i++) {
    if(nums[i] == 6) {
      while(nums[i] != 7) {
        i++;
      }
    }
    else {
      sum = sum + nums[i];
    }
  }
  return sum;
}
