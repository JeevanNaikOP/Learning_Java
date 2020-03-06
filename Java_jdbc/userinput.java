import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int projno;
		String projname,city;
		System.out.println("enter pno");
		projno=sc.nextInt();
		System.out.println("enter pname");
		projname=sc.next();
		System.out.println("enter city");
		city=sc.next();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jeevan","root","Nttdata@123");
			PreparedStatement ps=con.prepareStatement
					("Insert into project values(?,?,?)");
			ps.setInt(1, projno);
			ps.setString(2, projname);
			ps.setString(3, city);
			ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("connection not done"+e);
			
		}
	}

}
