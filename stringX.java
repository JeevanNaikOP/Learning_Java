
//Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


//stringX("xxHxix") → "xHix"
//stringX("abxxxcd") → "abcd"
//stringX("xabxxxcdx") → "xabcdx"

public String stringX(String str) {
 
    
        int len = str.length();

        if ( len < 3 )
        {
            return str;
        }
        String subStr = str.substring( 1, len - 1 );
        subStr = subStr.replace( "x", "" );

        return str.charAt( 0 ) + subStr + str.charAt( len - 1 );
}
