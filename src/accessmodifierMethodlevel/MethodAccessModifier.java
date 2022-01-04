package accessmodifierMethodlevel;

//DISSCUSSION OF METHOD LEVEL ACESS MODOFIER

public class MethodAccessModifier {
	
	public int a= 20;
	
	//a. public method
	
	public static void m1()//method which declared aas public is acceesible throughout the project provided the class should be declared as public
	                      //if class is accessible throught the project then only methods will be accessible
	                      //if the class is default then the methods inside it is not accessible outside the package but can be accessible in the same package
	{
	System.out.println("m1 method which is public from the MethodAccessModifier class ");	
	}
	
//b. <DEFAULT>  -->to make the method as default remove the public keyword
	
	void m2()
	{
		System.out.println("m2 method which is default in nature");
	}
	
	
//c. Private access modifier
	 
	private void m3() // method which are declared as private is accessible only inside the class and not outside the class
	{
		System.out.println("m3 method which is a private method");
	}
			
	public static void main(String[] args) {
		
		MethodAccessModifier mam = new MethodAccessModifier();
		mam.m3();
		
	}
	
	
//d. protected modifier
	
	protected void m4() //protected can be called into the same package by itd parents classs object but if we have to call outside the package then we have to call through child class ref variable 
	{
		System.out.println("m4 is a protected method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
