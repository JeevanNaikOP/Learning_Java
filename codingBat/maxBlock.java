/*Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.


maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
*/

public int maxBlock(String str) {
  int count=1;
  int max=0;
  if(str.length()==0) return 0;
  for(int i=0;i<str.length()-1;i++)
  {
    if(str.charAt(i)==str.charAt(i+1)){
    count++;}
    else count=1;
  if(count>max){
  max=count;
}
  }
  return max;
}
