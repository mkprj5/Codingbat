/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
*/
public boolean xyzThere(String str) {
  for(int i=0; i < str.length()-2; i++) {
    if(str.substring(i,i+3).equals("xyz")) {
      if(i==0) {
      return true;
      }
      else if(str.charAt(i-1) != '.') {
        return true;
      }
    }
  }
  return false;
}
