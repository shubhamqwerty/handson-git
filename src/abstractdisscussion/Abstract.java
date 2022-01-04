package abstractdisscussion;
// ABSTRACT ACCESS MODIFIER => WECAN DEFINE CLASS AS WELL AS METHODS AS ABSTRACT
// IN ABSTRACT CLASS WE  CAN DEFINE COMPLETE AS WELL AS INCOMPLETE METHOS

//WE CAN WRITE abstract public/ public abstract both of them are valid

public abstract class Abstract {
	
	// creating the constructer in abstract class
	
	public Abstract()
	{
		System.out.println("cinstructer of the abstract class");
	}
	
	
	
	public void m1()
	{
		System.out.println("m1 method from abstract class");
	}
	
	public  abstract void m2(); // this is a incomplete method so declare it as the abstract method
	public abstract void m4();
	
	public abstract static void m3();//static method caanot be abstract because sta
	
	
	public static void main(String[] args) {
		
		Abstract ab = new Abstract();
		ab.m1();// error we cannot create the object of the abstract class
		ab.m4(); // reason we cannot create the object of abstract class because we can have complete as well as incomplete method which can be called by user that can crete confusion to compiler
		//(suppose if object creation is posssible and  incomplete method are called by user it wil not have ant output since the methods are incomplete)
		
		
		
		
		
	}
	
	
	
	

}
