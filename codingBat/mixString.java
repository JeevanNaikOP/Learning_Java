/*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, 
the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
*/

public String mixString(String a, String b) {
  String c="";
  int max=Math.max(a.length(),b.length());
  for(int i=0;i<max;i++)
  {
    if(i<=a.length()-1)
   c=c+a.substring(i,i+1);
   if(i<=b.length()-1)
   c=c+b.substring(i,i+1);
  }
  return c;
}
