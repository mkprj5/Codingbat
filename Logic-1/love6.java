/*
The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
*/
public boolean love6(int a, int b) {
 
  if( a+b == 6 || Math.abs(a-b) == 6 || a == 6 || b == 6) {
    return true;
  }
  return false;
}
