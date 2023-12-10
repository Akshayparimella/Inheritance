abstract class project// abstract class name
{
	abstract void softwarerequirements();//abstract method
	abstract void hardwarerequirements();//abstract method
	void basepaper() //body of the method
	{
		System.out.println("IEEE base paper"); //Print IEEE base paper
	}
}
class javaproject extends project // class classname1 extends class name
{
	String projectname,projectdomain,frontend,backend; //String project name,project domain,front end,back end
	String operatingsystem,processor,ram_size,harddisk_size; //String operating,processor,processor,ram_size,harddisk_size
	javaproject(String pn,String pd,String fe,String be,String os,String p,String rs,String hs)//constructor
	{
		projectname= pn; //project name
		projectdomain=pd;//project domain
		frontend=fe; //front end
		backend=be; //back end
		operatingsystem=os; //operating system
		processor=p; //processor
		ram_size=rs; //ram_size
		harddisk_size=hs; //harddisk_size
	}
void softwarerequirements() // abstract method name
{
	System.out.println("projectname"+projectname); //print project name
	System.out.println("projectdomain"+projectdomain);// print project domain
	System.out.println("frontend"+frontend); //print front end
	System.out.println("backend"+backend); // back end
}
void hardwarerequirements() // abstract method name
{
	System.out.println("operating system"+operatingsystem); //print operating system
	System.out.println("processor"+processor); //print processor
	System.out.println("ram_size"+ram_size); //print ram size
	System.out.println("harddisk_size"+harddisk_size); // print harddisk_size
}
}
class pythonproject extends project //class classname2 extends class name
{
	String projectname,projectdomain,frontend,backend; //String project name,project domain,front end,back end
	String operatingsystem,processor,ram_size,harddisk_size;//String operating,processor,processor,ram_size,harddisk_size
	pythonproject(String pn,String pd,String fe,String be,String os,String p,String rs,String hs)//constructor
	{
		projectname= pn; //project name
		projectdomain=pd;//project domain
		frontend=fe; //front end
		backend=be; //back end
		operatingsystem=os; //operating system
		processor=p; //processor
		ram_size=rs; //ram_size
		harddisk_size=hs; //harddisk_size
	}
void softwarerequirements()
{
	System.out.println("projectname"+projectname); //print project name
	System.out.println("projectdomain"+projectdomain);// print project domain
	System.out.println("frontend"+frontend); //print front end
	System.out.println("backend"+backend); // back end
}
void hardwarerequirements()
{
	System.out.println("operating system"+operatingsystem); //print operating system
	System.out.println("processor"+processor); //print processor
	System.out.println("ram_size"+ram_size); //print ram size
	System.out.println("harddisk_size"+harddisk_size); // print harddisk_size
}
}
public class Project1 // class name
{
	public static void main(String[] args) //main function
	{
    javaproject jp=new javaproject("web-based stock market","bigdata perspective","J2EE","mysql","windows xp","pentiumIV","4GB(min)","20GB");//class name object=new class name object creation
	pythonproject py=new pythonproject("missing child identification","deep learning and muliticlass svm","python","html javascript css","windows 7 ultimate","pentiumIV","512MB","40GB");//class name object=new class name object creation
	jp.basepaper(); //method calling body of the method object.method name
    jp.softwarerequirements();// method calling object.abstract method name
    jp.hardwarerequirements();// method calling object.abstract method name
	py.basepaper();// method calling body of the method object.method name
	py.hardwarerequirements(); //method calling object.abstract method name
	py.softwarerequirements(); //method calling object.abstract method name
	}
}
