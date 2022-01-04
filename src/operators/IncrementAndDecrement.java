package operators;

public class IncrementAndDecrement {
	
	
	public static void main(String[] args) {
		
		
		
		int  a ;
		int b=100;
		                     //postincrement
		a=b++;
		
		System.out.println("the value of a post increment"+a);// 100
		System.out.println("the value of b post increment"+b);//101
		
		                   //preincrement
	a=++b;// updaated value of a is 101
	
	System.out.println("the value of a pre increment"+a);//102
	System.out.println("the value of b pre increment"+b);//102
		
		
		                  //postdecrement
	
	a=b--;// updated value is stored so b =102
	System.out.println("the value of a post decrment"+a);//102
	System.out.println("the value of b post decreent"+b);//101	
		
		                //predecrement
	
		a=--b; // b updated value 101
		
		System.out.println("the value of a pre decrment"+a);//100
		System.out.println("the value of b pre decreent"+b);//100	
			
		
	char p= 'w';	
		p++; // this take series in forward manner i.e w k bad x
	System.out.println(p);	
	
	//to print the ASC  value of alphabet
		
		int k = 'h';
		
		System.out.println(k);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
