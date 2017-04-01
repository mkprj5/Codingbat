/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
*/
public int close10(int a, int b) {
  
  int j = 10-a;
  j = Math.abs(j);
  int k = 10-b;
  k = Math.abs(k);
  if(a ==b || j == k) {
    return 0;
  }
  if (j < k) {
    return a; 
  }
  return b;
}
