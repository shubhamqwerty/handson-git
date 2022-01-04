package variabledisscussion;

public class NonStaticVariable {
	
	 int a =20; // declaring the nonstatic variable
	 
	 public static void main (String[] args) {
		 
		 // to access the non static variable we always have to make the objects
		 
		 NonStaticVariable ss = new NonStaticVariable ();
		 ss.a =12;
		 System.out.println(ss.a);
		 
		 System.out.println("*********");
		 
		 m1();
		 
		 System.out.println("**********");
		 
		 NonStaticVariable qq = new NonStaticVariable();
		 
		 qq.m2();
		 
		 NonStaticVariable yy = new NonStaticVariable();
	 System.out.println(yy.a);
	 
	 }
	 
	public static void m1()
	{ // to call a nonstatic variable into a Static method
		
		NonStaticVariable zz= new NonStaticVariable();
		System.out.println("the value of a in zz "+zz.a);
		
		zz.a =30;
		
		System.out.println("the updated value of a in zz :"+zz.a);
		
  		System.out.println("************");
		
		NonStaticVariable dd = new NonStaticVariable();
		System.out.println("the value of a in dd:"+dd.a);
		
		dd.a=12;
		
		System.out.println("the updated value of a in dd :"+ dd.a);
		
		
	}
	
	public void m2()
	{ // to call a non static variable in nonstatic method
	System.out.println(a);
	}
	
	
	
	
	
	
	
	

}
