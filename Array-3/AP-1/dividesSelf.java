/*
We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

dividesSelf(128) → true
dividesSelf(12) → true
dividesSelf(120) → false
*/
public boolean dividesSelf(int n) {
  int n2 = n;
  while(n > 0) {
    if(n%10 == 0) return false;
    if(n2% (n%10) ==0) n /= 10;
    else return false;
  }
  return true;
}
