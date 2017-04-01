/*
Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char. The strings may be any length, including 0.

matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
*/
  public int matchUp(String[] a, String[] b) {
  int count =0;
  for(int i=0; i<a.length; i++) {
    if(a[i] != "" && b[i] != "" && a[i].substring(0,1).equals(b[i].substring(0,1))) {
      count++;
    }
  }
  return count;
}
