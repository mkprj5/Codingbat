/*
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
*/
public int maxBlock(String str) {
  if(str.length() < 1) return 0;
  int count = 0;
  int ans=0;
  for(int i=0; i < str.length(); i++) {
      
      count = 0;
      int j = i+1;
      while(j < str.length() && str.charAt(i) == str.charAt(j)){
          count++;
          j++;
      }
      
      if(count > ans) {
         ans = count;
      }
  }
  return ans+1;
}
