/*Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of 
"not" anywhere in the string (case sensitive).


equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
*/

public boolean equalIsNot(String str) {
  int count=0;
  int coun=0;
  for(int i=0;i<str.length();i++)
  {
    if(i<str.length()-1){
    if(str.substring(i,i+2).equals("is"))
    count++;}
    if(i<str.length()-2){
   if(str.substring(i,i+3).equals("not"))
    coun++;}
  }
  if(count==coun) return true;
  return false;
}
