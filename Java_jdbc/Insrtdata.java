import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
public static void main(String[] args) {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Nttdata@123");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into JOB_194164 values(23,'jeevan')");
		System.out.println("success");
	}
	catch(Exception e)
	{
		System.out.println("connection not done"+e);
		
	}
}
}
