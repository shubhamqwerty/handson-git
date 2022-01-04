package variabledisscussion;

public class StaticAndNonStatic {
	
	static int i=10; //this is static variable
	
	int a =20; // this is a nonstatic variable
	
	public static void main (String[] args) {
		
		i=40;// the value of static variable gets updated in all objects when changed
		
		System.out.println("the value of static variable :"+i);//to print the variable
		
		
StaticAndNonStatic a = new StaticAndNonStatic();
 System.out.println("the value of nonstatic var : "+a.a); //to print the nonstatic variable
 
 System.out.println("the value of static variable :"+a.i);
 
 System.out.println("*********");
 a.a=30; 
System.out.println("the updated value of nonstatic var is : "+a.a);
		
StaticAndNonStatic b =new StaticAndNonStatic();

System.out.println("the value of nonstatic variable with b as ref var :"+b.a);
		
System.out.println("the value of static variable i :"+b.i);

b.a =34;

System.out.println("the updated value of the a through b ref var :"+b.a);
		
		
	b.i=50;
	
	System.out.println("the updated value of static variable through b :"+ b.i);
	System.out.println("the updated value of static variable through a :"+ a.i);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
