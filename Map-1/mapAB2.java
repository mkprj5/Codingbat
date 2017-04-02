/*
Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.

mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
*/
public Map<String, String> mapAB2(Map<String, String> map) {
  String temp1 = map.get("a");
  String temp2 = map.get("b");
  if( temp1!= null && temp2!= null && temp1.equals(temp2) )   {
    map.remove("a");
    map.remove("b");
  }
  return map;
}
