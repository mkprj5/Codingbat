/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
*/
public boolean linearIn(int[] outer, int[] inner) {
  int fl=0;
  int minO = outer[0];
  int maxO = outer[outer.length-1];
  for(int i=0; i < inner.length; i++) {
    fl=0;
    if(inner[i] >= minO && inner[i] <= maxO) {
      for(int j=0; j < outer.length; j++) {
        if(inner[i] == outer[j]) {
          fl = 1;
          break;
        }
      }
      if(fl==0) {
        return false;
      }
    }
    else {
      return false;
    }
    
  }
  return true;
}
