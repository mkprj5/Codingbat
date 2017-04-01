/*
Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice decomposition, write a separate helper method which finds the largest special score in an array. Write your helper method after your scoresSpecial() method in the JavaBat text area.

scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
*/
public int scoresSpecial(int[] a, int[] b) {
  int maxA = scoresSpecial(a);
  int maxB = scoresSpecial(b);
  return maxA+maxB;
}
public int scoresSpecial(int[] a) {
  int max = 0;
  for(int i=0; i<a.length; i++) {
    if(a[i]%10 == 0 && a[i] > max) {
      max = a[i];
    }
  }
  return max;
}
