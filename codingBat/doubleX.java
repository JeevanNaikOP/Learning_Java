
//Given a string, return true if the first instance of "x" in the string is immediately followed by another "x
boolean doubleX(String str) {
  int i=str.indexOf("x");
  if (i+1 >= str.length()) return false;
  if(i==-1) return false;
    return(str.substring(i,i+2).equals("xx"));
    
  
}
