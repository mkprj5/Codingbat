/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/
public String frontBack(String str) {
 if(str.length() <= 1  ) {
   return str;
 }
 String f = str.substring(0,1);
 String e = str.substring(str.length()-1);
 String mid = str.substring(1,str.length()-1);
 return e+mid+f;
 
}
