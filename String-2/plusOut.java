/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
*/
public String plusOut(String str, String word) {
  String result = "";
  int i=0;
  int end = 0;
  int l =str.length();
  while(i < str.length()) {
    end = i + word.length();
    if( end > l) {
      end=l;
    }
    if(str.substring(i,end).equals(word)) {
      result = result + word;
      i = i + word.length();
    }
    else {
      result = result + "+";
      i++;
    }
  }
  return result;
}

