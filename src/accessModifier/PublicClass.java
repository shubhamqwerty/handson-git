package accessModifier;

public class PublicClass {
	
	//disscussion of "public access modifier" at class level
	
	//"Public" access modofier allows the class to be accessible anywhere inside the project
	
	
	public  void m1()
	{
		System.out.println("m1 from PublicClass");
	}
	
	public static void main(String[] args) {
		
		PublicClass t = new PublicClass();
		
		t.m1();
	}
	
	
	
	
	
	

}
