/*Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. 
A number is a series of 1 or more digit chars in a row. 
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/

public int sumNumbers(String str) {
  int sum=0;
  String tmp="";
  for(int i=0;i<str.length();i++)
  {
    if(Character.isDigit(str.charAt(i))){
    if(i<str.length()-1&&Character.isDigit(str.charAt(i+1))){
    tmp=tmp+str.charAt(i);}
    else{
   tmp=tmp+str.charAt(i);
   sum=sum+Integer.parseInt(tmp);
   tmp="";
      
    }
          }
  }
  return sum;
}
