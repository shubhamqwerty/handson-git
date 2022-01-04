package variabledisscussion;

public class StaticVariable {
	
	static int i=20;
	
	public static void main(String[] args) {
		
	//to access the static variable
		
		System.out.println(i); //1st way
		
		System.out.println(StaticVariable.i);//2nd way
		
		i= i+4837;
		
		System.out.println("***********");
		
		System.out.println("The updated value of static variable i :"+i);
		
		m1();
		
		StaticVariable aa= new StaticVariable();
		aa.m2();
		
		}
	
	
	public static void m1() 
	{
		//calling the static variable in static method
		
		System.out.println(i);
		
		System.out.println(StaticVariable.i);
	}
	
	public void m2()
	{
		//calling the static variable in non static method
		
		System.out.println(i);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
