package constructorDisscussion;

public class ChildConstructor extends ParentConstructor {
	
	
	public ChildConstructor()
	{ 
		super(23);
		System.out.println("zero argumnt child class constructor");
	}
	
	
	public ChildConstructor(int e) 
	{
		//super(12);
	System.out.println("one agrument child class constructor");	
	}
	
	
	
	public static void main(String[] args) {
		
		
	//ChildConstructor cc= new ChildConstructor(); 	
		
		
	
	ChildConstructor cc1= new ChildConstructor(12); 
		
	}
	
	
//NOTE---> ONE ARGUMENT CONSTRUCTOR BYDEFAULT CAL	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
