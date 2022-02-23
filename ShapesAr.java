//method overlaoding program
class Shapes{
	public int area(int l,int b)
	{
		return l*b;
	}
	public int area(int a)
	{
		return a*a;
	}
	public float area(float r){
		float cir=(float)3.1*r*r;
		return cir;
	}
	public double area(double b,double h)
	{
		double ar=(b*h)/2;
		return ar;
	}
	public static int Perimeter(int l,int b)
	{
			int peri=2*(l+b);
			return peri;
	}
	public static int Perimeter(int a)
	{
		return 4*a;
	}
	
}
class ShapeAr{
	public static void main(String []args)
	{
		Shapes sp=new Shapes();
	
		int rect=sp.area(5,5);
		System.out.println("Area of rectangle"+rect);
		int sqr=sp.area(10);
		System.out.println("Area of Square"+sqr);
		double cir=sp.area(6);
		System.out.println("Area of circle"+ cir);
		double tri=sp.area(2.1,6.1);
		System.out.println("Area of triangle"+tri);
		int P1=sp.Perimeter(10,5);
		System.out.println("Perimeter of Rectangle "+P1);
		int P2=sp.Perimeter(5);
		System.out.println("Perimeter of Square "+P2);
	}
}