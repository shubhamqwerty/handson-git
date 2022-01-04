package methoddiscussion;

public class CategoriesOfMethod {
//	
	
public static void	 m1() 
{
System.out.println("m1 is running");
}
	
//without return with aruguments

public void m2 (int a, int v)
{
	m1();
	
	int g = a%v;
	
	System.out.println("m2  is running");
	
	System.out.println("The value g is  : "+g);
}
	
public static void addition(int a , int b)
{
	int c= a+b;
	
	System.out.println("The value of C is : "+ c);
}

public static void main(String[] args) {
	
	
	addition(12,33);
	
	CategoriesOfMethod cc = new CategoriesOfMethod();
	cc.m2(15,2);
	
	
	
}










	

}
