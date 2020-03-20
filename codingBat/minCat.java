
//Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


//minCat("Hello", "Hi") → "loHi"
//minCat("Hello", "java") → "ellojava"
//minCat("java", "Hello") → "javaello

public String minCat(String a, String b) {
int n1= a.length();
int n2=b.length();
  if(n1==n2) return a+b;
  if(n1>n2) return(a.substring(n1-n2)+b);
  else return(a+b.substring(n2-n1));
}
