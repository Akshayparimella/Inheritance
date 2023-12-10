class Example2
	{
		static int sid=10;
		static String name="ram";
		static String email="ram123@";
	    static void display()
	{
		System.out.println("enter student name"+sid);
		System.out.println("enter student name"+name);
	    System.out.println("enter student email"+email);	
	}
	}
	public class StaticExample
	{
		public static void main(String[] args) 
		{
	Example2.display();
	}
	}
	