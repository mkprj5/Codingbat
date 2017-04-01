/*
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.

biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
*/
public int[] biggerTwo(int[] a, int[] b) {
  int sum = a[0] + a[1];
  int sum1 = b[0] + b[1];
  
  if(sum >= sum1)   return a;
  return b;
}
