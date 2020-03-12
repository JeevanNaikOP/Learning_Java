
//Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
public String stringBits(String str) {
  String temp="";
  for(int i=0;i<str.length();i++)
  {
    temp=temp+str.charAt(i);
    i++;
    
  }
  return temp;
}
