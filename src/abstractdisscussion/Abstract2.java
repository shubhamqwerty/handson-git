package abstractdisscussion;

public abstract class Abstract2 extends Abstract {
// here we know the implementation of m2 but we still dont know the implementation of m4 therefore we declare this class as abstract
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		
		Abstractclass abs = new Abstractclass(); // this is the object of the CLASS which means implmentation of the all method is done and through this object we can call al method
		abs.m1();                                // same  object  will call the constructer 
		abs.m2();
		abs.m4();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
