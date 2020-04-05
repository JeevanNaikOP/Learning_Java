
/*Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
*/


public String doubleChar(String str) {
  String ls="";
  for(int i=0;i<=str.length()-1;i++)
  {
    ls=ls+str.charAt(i);
    ls=ls+str.charAt(i);
  }
      return ls;
}
