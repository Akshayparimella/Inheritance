interface about //interface class1
{
	void info(); //abstract method
}
interface staff //interface class2
{
	void teachstaff();//abstract methods
	void nonteachstaff();
}
class student //base class
{
	int no_of_students; // instance member variables
	student(int n) //student constructor
	{
		no_of_students=n;
	}
}
class records extends student implements about,staff //derived class using implements keyword defining the interface class1,interface class2 
{
	String collegename,city,state;
	int no_of_departments,no_of_teach_staff,no_of_non_teach_staff; //instance member
	records(String cn,int nd,String c,String s,int ns,int ts,int nts)//constructor
	{
		super(ns); //super method
		collegename=cn; //college name
		no_of_departments=nd; //number of departments
		city=c; //city
		state=s; //state
		no_of_teach_staff=ts; //number of teach staff
		no_of_non_teach_staff=nts; //number of non teach staff
}
public void info() //abstract method
{
	System.out.println("college name"+ collegename); //print college name
	System.out.println("number_of_departments"+ no_of_departments); //print number of departments
	System.out.println("city name"+ city); //print city name
	System.out.println("state name"+state); //print state name
	System.out.println("number of student"+ no_of_students); //print number of students
}
public void teachstaff() //abstract method
{
	System.out.println("number of teach staff"+ no_of_teach_staff); //print number of teach staff
}
public void nonteachstaff() //abstract method
{
	System.out.println("number of non teach staff"+ no_of_non_teach_staff); //print number of non teach staff
}
}
public class CollegeData //class name
{
	public  static void main(String []args) //main function
	{
		records sc=new records("jntuh university",10,"hyderabad","telangana",500,30,77); //object creation for derived class 
				sc.info(); //method calling object.info
		        sc.teachstaff(); //method calling object.teachstaff
		        sc.nonteachstaff(); //method calling object.nonteachstaff
	           
	}
	
}



