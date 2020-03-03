public class MainMessage {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Message message = new Message();
		try
		{
			System.out.println(message.charCount("DATA"));
			System.out.println(message.charCount("New value"));
			System.out.println(message.charCount(null));
			System.out.println(message.charCount("My value"));
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}

}
