package accessModifier;

public class T2protected  extends ProtectedTestClass{
	
	
	ProtectedTestClass pt = new ProtectedTestClass();
	pt.dummy(); // dummy which is protected is not accessible because ProtectedTestClass is the parent class here and we r accesing it outsude the package
	
	
	T2protected t2 = new T2protected();
	t2.dummy();
	
	
	
	
	
	
	
	
	
	

}
