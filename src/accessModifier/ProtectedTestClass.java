package accessModifier;

import accessmodifierMethodlevel.Protectedmethod;

public class ProtectedTestClass extends Protectedmethod {
	
	public static void main(String[] args) {
		
		Protectedmethod pm =new Protectedmethod();
		pm.dummy(); // trying to caal the protecred method from another package through parent ref variable
		

		ProtectedTestClass pt = new ProtectedTestClass();
		pt.dummy(); //calling the protected method from differnt pakage through child ref variable
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
