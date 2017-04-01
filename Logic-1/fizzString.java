/*
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
*/
public String fizzString(String str) {
  if( str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b') return "FizzBuzz"; 
  if( str.charAt(0) == 'f') return "Fizz";
  if(str.charAt(str.length()-1) == 'b') return "Buzz";
  return str;
}
