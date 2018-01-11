package pkg1;

public class Child extends Product {
	void childMethod(){
		System.out.println("\nSame pkg child");
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		
		staticMethod();
	}

}
