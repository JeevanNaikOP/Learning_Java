
//Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front
public String frontTimes(String str, int n) {
  int ja=3;
  
  String result="";
  if(str.length()<3)
          ja=str.length();
          
      String temp=str.substring(0,ja);    
        for(int i=0;i<n;i++)
  {
        result=result+temp;
          }
          
  return result;
    }
