package variabledisscussion;

public class LocalVariable {

	int  i = 11;
	
	static int j = 22;
	
	public void m1()
	//"this" keyword is used  in a nonstatic area
	{
		int i =10;
		int j = 30;
		
		System.out.println(i);// this will print the value of local variable//10 
		System.out.println(this.i);//22//  this will print the value of class level non static variable
		
		System.out.println(j); //30
		
		System.out.println(LocalVariable.j);//22
		System.out.println(this.j);//22// class level in nonstatic manner
	}
	
	public static void m2()
	//"this" keyword is invalid in static area
	{
		 int  i = 100;
		 int j= 2200;
		 
		 System.out.println(i);//100
		System.out.println(LocalVariable.j);
	//	System.out.println(this.j); invalid bcause this is used in  a nonstatic area 
		
		LocalVariable kk = new LocalVariable(); // to call a nonstatic variable into into static method 
		
		System.out.println(kk.i);
		
	//	System.out.println(this.i); // this is invalid
		
		
	}
	
	public static void m3()
	{
		int q = 10;
		
		if(true) 
		{int  k = 20;
		System.out.println(k);
		
		System.out.println(q);// here q is accesible since if is a part of  m1 and m1 contains q
		}
		
}
	
	public static void main(String[] args) 
	{
		 m2();
	}
	
}
