package methoddiscussion;

public class NonStaticMethodDisscussion2 {
	
	
	public void cons()
	{
		System.out.println("This is Cons method");
	}
	
	 public void abc()
	 {
		 System.out.println("abc method is running");
		 
		 StaticMethodDisscussion2.price();
	 }
	
	
	public static void main (String[] args) {
		
		NonStaticMethodDisscussion2 qw = new NonStaticMethodDisscussion2();
		qw.abc();
		qw.cons();
		
		NonStaticMethodDisscussion ss = new NonStaticMethodDisscussion();
		ss.division();
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
