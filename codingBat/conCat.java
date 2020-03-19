
//Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


//conCat("abc", "cat") → "abcat"
//conCat("dog", "cat") → "dogcat"
//conCat("abc", "") → "abc"

public String conCat(String a, String b) {
  int i=a.length();
  if(a.length()>0&&b.length()>0)
  if(a.substring(i-1).equals(b.substring(0,1))) return(a.substring(0,(a.length()))+b.substring(1,b.length()));
  return a+b;
  
  
}
