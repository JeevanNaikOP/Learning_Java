import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class SelectData 
{
	public static void main(String[] args)
	{
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Nttdata@123");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM JOB_194164");
			ResultSetMetaData rm=rs.getMetaData();
			System.out.println("1st"+rm.getColumnName(1));
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"
				+rs.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.println("connection not done"+e);
			
		}
	
	}
}
	
