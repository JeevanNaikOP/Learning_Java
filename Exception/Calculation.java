void calc()
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("enter 2 nos");
		num1=sc.nextInt();
		num2=sc.nextInt();
		try
		{
		int res=num1/num2;
        System.out.println("result:"+res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println("My codes");
	}
		public static void main(String[] args) {
			Calculation c=new Calculation();
			c.calc();
		}
	}
