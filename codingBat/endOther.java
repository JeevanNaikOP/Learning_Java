/*Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/

public boolean endOther(String a, String b) {
a=a.toLowerCase();
b=b.toLowerCase();
int len1=a.length();
int len2=b.length();
if(len1>len2)
{
String temp=a.substring(len1-len2,len1);
if(temp.compareTo(b)==0)
{
return true;}
else return false;
}
else
{
  String temp=b.substring(len2-len1,len2);
  if(temp.compareTo(a)==0)
  {
    return true;}
    else return false;
}
}
