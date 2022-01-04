package methoddiscussion;

public class StaticMethodDisscussion2 {
	
	public static void price()
	{
		int perhead =12;
		
		int items= 48393;
		
		int  totalprice = perhead*items;
		
		
		System.out.println("The value of the totalprice is:"+totalprice);
		
		
		NonStaticMethodDisscussion aa = new NonStaticMethodDisscussion();
		aa.division();
		aa.m1();
		
	}
	
	
	public static void main(String[] args)
	{
		price();
		
		StaticMerhodDiscussion.addition();
		StaticMerhodDiscussion.multiplication();
	}
	
	

}
