public class Thiskeyword 
{
int employeeid;
String employeename;
Thiskeyword(int empid,String empname)//constructor
{
	this.employeeid=empid; //this keyword current class instance member variables
	this.employeename=empname;
}
void display() 
{
System.out.println("employee id"+employeeid);
System.out.println("employee name"+employeename);
}
public static void main(String[] args) 
	{
	Thiskeyword sc=new Thiskeyword(10,"ram");//class name object=new class name(parameters);
	sc.display();//method calling with an object 
	}
}
