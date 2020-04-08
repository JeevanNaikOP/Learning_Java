/*A sandwich is two pieces of bread with something in between. 
Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string ""
if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
*/

public String getSandwich(String str) {
int ind = str.indexOf("bread");
    int laind = str.lastIndexOf("bread");
    if((laind != -1 ) && (ind!=laind))
        return (str.substring(ind+5,laind)) ;
    return "";
}
