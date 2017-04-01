/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
*/
public String starOut(String str) {
  String pattern = "([a-zA-Z0-9]{0,1})\\*+([a-zA-Z0-9]{0,1})";
  str = str.replaceAll(pattern, "");
  return str;
}
