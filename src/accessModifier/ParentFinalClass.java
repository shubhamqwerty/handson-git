package accessModifier;

public final class ParentFinalClass {
	
	//disscussion of "final" access modifier
	//RULE--> WHEN WE DECLARE A PARTICULAR CLASS AS FINAL WE CANNOT MAKE THE CHILD CLASS OF THat class but the SAME CLASS IS ACCESSIBLE ANYWHERE BECAUSE OF "PUBLIC" KEYWORD
	//"FINAL" KEYWORD IS USED WHEN WE DONT HAVE TO MAKE THE CHILD CLASS OF THE EXISITING CLASS
	// WHEN THE PARTICULAR CLASS IS DECLARED AS "FINAL" THEN THEN THAT CLASS CAN BE A CHILD CLASS OF SOME OTHER CLASS BUT CANNOT CREATE THE CHILD CLASS OF OWN 

	
	
	public void property()
	{
		System.out.println("property methof from the parrent class");
	}
	
	 public void home()
	 {
		 System.out.println("home method from the parent class");
		 
	 }
	
	public void car()
	{
		System.out.println("car method from the parent class");
	}
	
	final class Parent  // this class is accessible inside the same package but not outside the package and we cannot create the child class of it
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
