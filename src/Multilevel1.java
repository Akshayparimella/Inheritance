//multilevel inheritance
class rectangle
{
	int length,breadth; //integer data type variable declaration
	rectangle(int l,int b)//constructor
	{
	length=l;//instance member variables
	breadth=b;
	}
void area()//method declaration
{
	System.out.println("area of rectangle"+ length*breadth); //print area of rectangle using the formulae l*b
}
	}
class triangle extends rectangle
{
	int breadth,height;
	triangle(int b,int h)
	{
	super(b,h);
	breadth=b;
	height=h;
	}
	void area()
	{
		super.area();
		System.out.println("area of triangle"+ (0.5*breadth*height));
	}
}
class circle extends triangle
{
int radius;
int breadth;
int height;
circle(int b,int h, int r)
{
	super(b,h);
	radius=r;
	breadth=b;
	height=h;
}
void area()
{
	super.area();
	System.out.println("area of circle" + (3.14*radius*radius));
	}
}
public class Multilevel1 {

	public static void main(String[] args) {
    circle sc=new circle(10,15,20);
    sc.area();
	
	}

}
