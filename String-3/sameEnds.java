/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
*/
public String sameEnds(String string) {
  String s = "";
  String large = "";
  int end = 0;
  for(int i=0; i<string.length(); i++) {
    s = string.substring(0,i);
    for(int j=i; j<=string.length()-s.length(); j++) {
      if(string.substring(j,j+s.length()).equals(s))
      {
        large = s;
      }
    }
  }
  return large;
}
