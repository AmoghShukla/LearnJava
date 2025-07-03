package Random;

public class MethodOverloadingCase1 {
	public void m1(String s1) {
		System.out.println("String-version");
	}
	public void m1(StringBuffer s) {
		System.out.println("StringBuffer-version");
	}
	public static void main(String[] args) {
		MethodOverloadingCase1 t = new MethodOverloadingCase1();
		t.m1("Hello"); // String-version
		t.m1(new StringBuffer("Hello")); // StringBuffer-version
		//t.m1(null); // Ambiguous call, will not compile
	}

}
