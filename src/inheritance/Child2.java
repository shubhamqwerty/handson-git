package inheritance;
// inheritance is used when there are some common logic/methods used inthe project and we can access them through inheritance concept by creating the parent child relationship by using extends keyword which allows us to access other class method and logics by creating the single object if nonstatic and directlyy by name of methods if static
// with the help of inheritance we achieve reusability of code




public class Child2 extends Parent2{
	
	 double land=2.5;
	 
	 int a = 30;
	
	static double grandlnd;
	
	 public void bike() {
		 System.out.println("bike method from chid class");
		 
		
		                                       // VARIABLE DISSCUSSION
		 
		System.out.println(a);	// child2 class variable
		
		System.out.println(this.a);  // child2 class variable
		
		System.out.println(super.b); //parent2 class variable
		
		System.out.println(super.c); // parent2 class varaible
		
		System.out.println(c); // parent2 class variable can be called direcly without using SUPER  keyword sice c is not repeated in both the class
		
		//SUPER KEYWORD IS USED WHEN THE VARIABLES OF THE PARENT AND THE CHHILD CLASS HAVE THE SAME NAME  AND WE IT WHEN WE HAVE TO CAL A PARENT CLASS CLASS LEVEL VARIABLE INTO A CHILD CLASS
		//BUT IF THE VARIABLES DO NAT HAVE THE SAME NAME THEN WE CASLL IT BY NORMAL METHOD
		
		// THIS KEYWORD IS USED WITHIN THE CLASS IF THE CLASS LEVEL VARIABLE AND THE LOCAL VARIABLE HAVE THE SAME NAME AND WE HAVE TO ACCESS THE CLASS LEVEL VARIABLE INTO THE  METHOD  AT SUCH TIME WE USE THIS KEYWORD 
		
		// SUPER AND THIS IS USED ONLY IN NONSTATIC AREA
		
		
		
		
		 
 }
	
	
	public static void main (String[] args) {
		
		
		Child2 c2 = new Child2 ();
		c2.home();
		c2.property();
		c2.car();
		
		
		
		c2.bike();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
