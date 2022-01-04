package methoddiscussion;

public class CategoriesOfMethod2 {
	
	public static boolean m1()
	{
		System.out.println("m1 method with return type");
		
		return false;
	}

	public int m2()
	{
		System.out.println("method with return type withour arguments");
		
		int a = 12;
		int b =32;
		int c =a+b;
		System.out.println(c);
		
		return 2241532 ; 
	}
	
	
	public static String m4(int a, int b , String c)
	{
		a=a+574689698;
		System.out.println("The Value of a : "+a);
		
		System.out.println("The Value of b :"+ b);
		
		System.out.println(c+"city");
		
		return "yavatmal";
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		boolean aa=m1();
		System.out.println(aa);
		
		CategoriesOfMethod2 q = new CategoriesOfMethod2();
                   int ref=q.m2();
                   System.out.println(ref);
		
		String rew=m4(123,456,"velo");
		
		System.out.println(rew);
		
		
		
	}
	
	

}
