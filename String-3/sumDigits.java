/*
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
*/
public int sumDigits(String str) {
  int sum=0;
  for(int i=0; i < str.length(); i++) {
    if(Character.isDigit(str.charAt(i))) {
      sum = sum + Integer.parseInt(str.substring(i,i+1));
    }
  }
  return sum;
}
