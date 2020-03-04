package interf;

import java.util.Scanner;
public class Third implements First{
		String bookname;
		int bookid;
		Scanner sc=new Scanner(System.in);
		public void input(int id,String name){
		
	//		System.out.println("id");
//			id=sc.nextInt();
	//		System.out.println("name");
//			name=sc.next();
			System.out.println("bookid");
			bookid=sc.nextInt();
			System.out.println("bookname");
			bookname=sc.next();
			
				System.out.println("id"+id);
				System.out.println("name"+name);
				System.out.println("person bookid:"+bookid);
				System.out.println("person bookname:"+bookname);
				
			
					
		}
		
		
	}
