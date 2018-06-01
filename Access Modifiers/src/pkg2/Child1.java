package pkg2;

import pkg1.Product;

public class Child1 extends Product {
	public void child1Method(){
		System.out.println("\nOther pkg child");
		System.out.println(pub);
		System.out.println(pro);
		
		Product.staticMethod();
	}

}
