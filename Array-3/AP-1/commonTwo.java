/*
Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
*/
public int commonTwo(String[] a, String[] b) {   
  int count = 0;
  String str = "";
  for (int i = 0; i < b.length; i++) {
    for (int j = 0; j < a.length; j++) {
      if (a[j].equals(b[i]) && !str.contains(a[j])) {
        str += a[j];
        count++;
      }
    }
  }
  return count;
}
