/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
*/
public boolean hasBad(String str) {
  if(str.length() <= 2) {
    return false;
  }
  if(str.substring(0,3).equals("bad") || (str.length() >= 4 &&str.substring(1,4).equals("bad"))) {
    return true;
  }
  return false;
}
