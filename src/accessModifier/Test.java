package accessModifier;

public class Test {
	
	
	public static void main(String[] args) 
	{
		PublicClass pc = new PublicClass();
	pc.m1(); // accesing the method from the class which is declared as public
	
	
	DefaultClass df = new DefaultClass();
	df.m2(); // accessing the method from the default class
	
	
	ParentFinal pp =new ParentFinal();
	pp.home(); // this method is accessible because  though the ParentFInal is declared as final but the class is still public so we can access the method in regular way

	
	
	}

		
	
	

}
