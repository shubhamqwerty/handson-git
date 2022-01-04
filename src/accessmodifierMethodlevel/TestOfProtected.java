package accessmodifierMethodlevel;

public class TestOfProtected extends Protectedmethod {
	
	public static void main(String[] args) {
		
		Protectedmethod pm = new Protectedmethod();
		pm.dummy(); // protected method called in the same package through parent 
		
		
	}
	

}
