
//Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


//seeColor("redxx") → "red"
//seeColor("xxred") → ""
//seeColor("blueTimes") → "blue

public String seeColor(String str)
{
	int len = str.length();
	if(len >= 4)
	{
		if(str.substring(0, 4).equals("blue"))
			return "blue";
		else if(str.substring(0, 3).equals("red"))
			return "red";
		else
			return "";
	}	
	else if(len == 3)
	{
		if(str.substring(0, 3).equals("red"))
			return "red";
		else
			return "";
	}
	else
		return "";
}
