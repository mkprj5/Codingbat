/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/
public String altPairs(String str) {
  if(str.length() <= 2 ) {
    return str;
  }
  String s ="";
  for(int i=0; i <str.length();i += 4) {
    int end = i+2;
    if(end > str.length() ) {
      end = str.length();
    }
    s = s + str.substring(i,end);
  }
  return s;
}
