package constructorDisscussion;

public class ParentConstructor extends GrandparentConstructor {
	
	
	public ParentConstructor() 
	{super(23);
	System.out.println("zero argument parent constructor");
		
	}
	
	public ParentConstructor(int q) 
	{
	System.out.println("one argument parent constructor");
		
	}
	
	

}
