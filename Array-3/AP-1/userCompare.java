/*
We have data for two users, A and B, each with a String name and an int id. The goal is to order the users such as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same. Order first by the string names, and then by the id numbers if the names are the same. Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate how str1 is ordered to str2 (the value is not limited to -1/0/1). (On the AP, there would be two User objects, but here the code simply takes the two strings and two ints directly. The code logic is the same.)

userCompare("bb", 1, "zz", 2) → -1
userCompare("bb", 1, "aa", 2) → 1
userCompare("bb", 1, "bb", 1) → 0
*/
public int userCompare(String aName, int aId, String bName, int bId) {
  if (aName.equals(bName) && aId == bId)
    return 0;
  
  int result = aName.compareTo(bName);
  if (result < 0)
    return -1;
  else if (result > 0)
    return 1;
  else if (aId > bId)
    return 1;
  else
    return -1;

}
