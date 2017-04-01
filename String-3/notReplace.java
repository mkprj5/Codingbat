/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
*/
public String notReplace(String str) {
  
  String result = "";
  str = " " + str + "  ";
  for(int i=0; i <=str.length()-2; i++) {
    if(str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1))
                  && !Character.isLetter(str.charAt(i+2)))
    {
      result = result + "is not";
      i = i+1;
    }
    else {
      result = result + str.charAt(i);
    }
  }
  return result.substring(1,result.length()-1);
} 
