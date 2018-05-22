package pkg1;

public class NonChild {
	Product a = new Product();
	void nonChildMethod(){
		System.out.println("\nSame pkg non child");
		System.out.println(a.pub);
		System.out.println(a.pro);
		System.out.println(a.def);
		
		
		Product.staticMethod();
	}
	
	

}
