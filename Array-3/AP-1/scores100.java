/*
Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.

scores100([1, 100, 100]) → true
scores100([1, 100, 99, 100]) → false
scores100([100, 1, 100, 100]) → true
*/
public boolean scores100(int[] scores) {
  for(int i=0; i < scores.length-1; i++) {
    if(scores[i] == 100 && scores[i+1] == 100) return true;
  }
  return false;
}
