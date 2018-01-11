package pkg1;

import pkg2.Child1;
import pkg2.NonChild1;

public class Product {
	static int noOfProducts;
	
	public String pub = "Public";
	private String pri = "Private";
	protected String pro = "Protected";
	String def = "Default";
	
	/*public Product(){
		pub = "Public";
		pri = "Private";
		pro = "Protected";
		def = "Default";
	}*/
	
	
	
	/*public Product(String pub, String pri, String pro, String def) {
		super();
		this.pub = pub;
		this.pri = pri;
		this.pro = pro;
		this.def = def;
	}*/



	static public void staticMethod(){
		System.out.println("\n\n" + noOfProducts + "\n\n");
	}
	
	static{
		System.out.println("Inside static block");
		System.out.println(noOfProducts+"\n\n");
	}
	
	
	void sameClassMethod(){
		System.out.println("Same class");
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(def);
	}
	public static void main(String args[]) {
		Product c = new Product();
		NonChild1 d = new NonChild1();
		Child e = new Child();
		Child1 f = new Child1();
		NonChild g = new NonChild();
		c.sameClassMethod();
		e.childMethod();
		d.nonChildOtherPkg();
		g.nonChildMethod();
		f.child1Method();
		
		staticMethod();
		
	}
}
