/*Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
*/

public String sameEnds(String string) {
  String last="";
  String tmp="";
  for(int i=0;i<string.length();i++)
  {
    tmp=tmp+string.substring(i,i+1);
    int len=tmp.length();
    if(i<string.length()/2&&tmp.equals(string.substring(string.length()-len,string.length())))
    last=tmp;
      }
      return last;
}
