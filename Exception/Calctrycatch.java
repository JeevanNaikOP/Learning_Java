import java.util.Scanner;

public class Newcalc {
	int array[]={1,2,3,0,4,5,6};
	void calc()
	{
//		Scanner sc=new Scanner(System.in);
//		int num1,num2;
//		System.out.println("enter 2 nos");
//		num1=sc.nextInt();
//		num2=sc.nextInt();
		try
		{
			try
			{
			 array[7]=8;
			for(int ar:array)
			{
				System.out.println(ar);
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		int res=array[2]/array[3];// 3/0
        System.out.println("result:"+res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println("My codes");
	}
		public static void main(String[] args) {
			Newcalc c=new Newcalc();
			c.calc();
		}
	}
