/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
*/
public boolean equalIsNot(String str) {
  int isCount = 0;
  int notCount =0;
  int isMax = 0;
  int notMax =0;
  for(int i=0; i < str.length(); i++) {
  
    isMax = i +2;
    if(isMax > str.length()) {
      isMax = str.length();
    }
    notMax = i +3;
    if(notMax > str.length()) {
      notMax = str.length();
    }
    if(str.substring(i,isMax).equals("is")) {
      isCount++;
    }
    
    if(str.substring(i,notMax).equals("not")) {
      notCount++;
    }
    
  }
  return (isCount == notCount);
}
