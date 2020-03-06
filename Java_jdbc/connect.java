
import java.sql.Connection;
import java.sql.DriverManager;



public class Connect {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
			System.exit(-1);
			
		}
		try
		{
			Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/test","root","Nttdata@123");
			if(con!=null)
			{
				System.out.println("finally did");
			}
			else
			{
				System.out.println("failed");
			
			}
		}
			catch(Exception e)
			{
				System.out.println("connection not done");
				
			}
		
	}

}
