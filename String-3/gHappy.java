/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
*/
public boolean gHappy(String str) {
  if (str.length() < 1) return true;
  str = "x" + str + "x";
  int fl=0;
  for(int i = 0; i <str.length(); i++) {
    if(str.charAt(i) == 'g') {
      if(str.charAt(i+1) != 'g' && str.charAt(i-1) != 'g') {
          return false;
        }
        fl=1;
    }
  }
  return (fl==1);
}
