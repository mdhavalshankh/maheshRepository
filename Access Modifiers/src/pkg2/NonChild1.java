package pkg2;

import pkg1.Product;

public class NonChild1 {
	Product b = new Product();
	public void nonChildOtherPkg(){
		System.out.println("\nOther pkg non child");
		System.out.println(b.pub);
		
		Product.staticMethod();
	}
		
}
