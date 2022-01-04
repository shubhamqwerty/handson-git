package inheritance;

public class Child3 extends Parent2 {

public static void main (String[] args) {	
	
	
	Child3 c3 = new Child3();
	c3.home();
	c3.property();
	c3.car();
	
	c3.bike();// not accesssible because the child3 does not have the access of child2 class
	
farm(); // this called as multilevel inheritance since child extends parents and parent extends grandparent
	
	//top most super classs will be accessible to sub class
	
// MULTILEVEL INHERITANCE IS POSSIBLE BUT MULTIPE INHERITANCE IS NOT POSSIBLE

// MULTIPLE INHERITANCE ----> MEANS IF WE ARE TRYING TO CREATE MORE THAN ONE PARENT OF ANY CHILD THEN IT IS MULTIPLE INHERITANCE WHICH IS INVALID IN MULTIPLE INHERITANCE WE ARE  TRYING TO CREATE TWO DIFFERENT PARENT CLASS OF A SINGLE CLASS

// MULTILEVEL INHERITANCE IS POSSIBLE BECAUSE ---> EVERY CLASS HAS ONLY ONE PARENT CLASS

	
}
	
	
	}
