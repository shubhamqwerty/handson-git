package accessModifier;

public class Child extends ParentFinal {// error because the ParentFinal class is declared as final

	public void bike()
	{
	System.out.println("bike method from the child");	
	}
	
	public void newgenerationmarry()
	{
		System.out.println("marry method from the child class");
	}
	
	public static void main(String[] args)
	{
		Child cc =new Child();
		cc.property();
		cc.home();
		cc.car(); //this method are no longer accessible since the parent classs is declared as final
		
		ParentFinal pp =new ParentFinal();
		pp.home(); // this method is accessible because  though the ParentFInal is declared as final but the class is still public so we ccan access the method in regular way
		
		
		
		
		
	}
	
	
	
	
	
	
}
