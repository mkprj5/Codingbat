/*
A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
*/
public String getSandwich(String str) {
  int f = -1;
  int l = -1;
  for(int i=0; i < str.length()-4; i++) {
    if(str.substring(i,i+5).equals("bread")) {
      if(f==-1) {
        f=i;
      }
      l=i;
    }
  }
  if( f == l) {
    return "";
  }
  return str.substring(f+5,l);
}
