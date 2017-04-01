/*
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
*/
public String nTwice(String str, int n) {
  return str.substring(0,n) + str.substring(str.length()-n);
}
