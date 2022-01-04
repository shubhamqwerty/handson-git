package methoddiscussion;

public class NonStaticMethodDisscussion {
	
	public void m1()
	{
		System.out.println("m1 method is running");
	}
	
	public void division()
	{
		int  a=12;
		int b = 4;
	    int c= a/b;
	
	System.out.println("The value of c : "+ c);
	
	m1();
	}
	
	
	public static void main(String[] args) {
		
		NonStaticMethodDisscussion ns = new NonStaticMethodDisscussion();
		
		ns.division();
		
		
		
		
		
	}
	
	
	
	
	
	

}
