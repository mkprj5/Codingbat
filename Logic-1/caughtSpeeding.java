/*
You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0
*/
public int caughtSpeeding(int speed, boolean isBirthday) {
  int a=0;
  int c=0;
  if(isBirthday) {a=5;}
  if(speed<= 60+a) c=0;
  if (speed >= 61+a && speed <= 80+a) c=1;
  if (speed >= 81+a) c=2;
  
  return c;
}
