import java.util.Scanner;
class Marshmallow  // super class or base class or existing class
{
	void features()
	{
		
		System.out.println("Masrshmallow features");
		System.out.println("native fingerprint support");
		System.out.println("inactive apps will be put to sleep");
	}
}
	class Nougat extends Marshmallow //level 1
	{
		void features()
		{
			super.features();
			System.out.println("Nougat features");
			System.out.println("split screen mode now with multitasking ease");
			System.out.println("picture in picture mode now you continue watching your current video ");
			
		}
	}
 class Oreo extends Nougat //level 2
 {
	 void features()
	 {
		 super.features();
		 System.out.println("Oreo features");
		 System.out.println("notifications dots");
         System.out.println("swhort cut pinning");
	 }
 }
 class Pie extends Oreo //level 3
 {
	 void features()
	 {
		 super.features();
		 System.out.println("pie features");
		 System.out.println("select to speech");
		 System.out.println("OCR in camera view");
	 }
 }


public class Multilevel
{
public static void main(String[] args)
{
    Pie sc=new Pie();
    sc.features();
	}
}


