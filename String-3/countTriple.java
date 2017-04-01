/*
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
*/
public int countTriple(String str) {
String a = "";
int count=0;
 for(int i=0; i <= str.length()-3;i++) {
   a = ""+ str.charAt(i);
   if(str.substring(i,i+3).equals(a+a+a)) {
     count++;
   }
 } 
 return count;
}
