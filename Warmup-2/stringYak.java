/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
*/
public String stringYak(String str) {
  String s ="";
  if(str.length() > 3) {
    for(int i=0; i < str.length(); i++) {
      int end = i + 3;
      if(end > str.length()) {
        end = str.length();
      }
      if(str.substring(i,end).equals("yak")) {
        s=s;
        i=i+2;
      }
      else {
        s = s + str.substring(i,i+1);
      }
    }
  }
  return s;
}
