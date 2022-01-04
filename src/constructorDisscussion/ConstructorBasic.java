package constructorDisscussion;

public class ConstructorBasic {
	
int y;
int r ;	
	public ConstructorBasic()
	{
		this(12);
		
		System.out.println("zero arguments constructor");
	}
	
	public ConstructorBasic(int a)
	{
		this(true, "shubham");
		
	System.out.println("one argument constructor");	
	}
	
	public ConstructorBasic(boolean q , String w)
	{
		this(12,34,23.434);
		
		System.out.println("two argument constructor");
	}
	
	public ConstructorBasic(int a, int v ,double c)
	{
		this(123.321f,'@',false,98);
		
		System.out.println("three argument constructor");
	}
	
	public ConstructorBasic(float g, char l, boolean v, int k)
	{
		System.out.println("four argument constructor");
	}
	
	
	public static void main(String[] args)
	{
		
		ConstructorBasic cb =new ConstructorBasic();
//		System.out.println(cb.y);
//		
//		System.out.println("*************");
//		
//		ConstructorBasic cb1 = new ConstructorBasic(12);
//		
//		System.out.println("***************");
//		
//		ConstructorBasic cb2 = new	ConstructorBasic(false, "jai shree mataji");
//	  
//	System.out.println("***********");
//	
//	ConstructorBasic cb3 =new 	ConstructorBasic(3244,43,235645.4235);
//	
//	System.out.println("****************");
	
	//ConstructorBasic cb4 = new 	ConstructorBasic(123.321f,'&',true,54);
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
