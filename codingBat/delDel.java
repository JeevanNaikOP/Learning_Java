
//Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged
public String delDel(String str) {
  String temp="";
  // for(int i=0;i<str.length()-1;i++)
  // {
    if(str.length()>3&&str.substring(1,4).equals("del"))
    temp=str.substring(0,1)+str.substring(4);
    else
    temp=str;
    
  // }
  return temp;
}
