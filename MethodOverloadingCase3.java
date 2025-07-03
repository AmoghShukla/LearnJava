package Random;

public class MethodOverloadingCase3 {
	public void m1(Object o) {
		System.out.println("Object-args");
	}
	public void m1(String s1) {
		System.out.println("String-args");
	}
	public static void main(String[] args) {
		MethodOverloadingCase3 t = new MethodOverloadingCase3();
		t.m1("Hello"); // String-args
		t.m1(10); // Object-args, as Integer is a subclass of Object
		t.m1(new Object()); // Object-args
		t.m1(null);	
	}
}
