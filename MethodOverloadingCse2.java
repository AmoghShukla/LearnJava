package Random;

public class MethodOverloadingCse2 {
	public void m1(int i){
		System.out.println("int-args");
	}
	public void m1(String s1){
		System.out.println("string-args");
	}
	public void m1(){
		System.out.println("no-args");
	}
	public static void main(String[] args){
		MethodOverloadingCse2 t = new MethodOverloadingCse2();
		t.m1(); //no-args
		t.m1(10); //int-args
		t.m1("Amogh"); //string-args
		//t.m1(10.5); double-args, this will not compile as there is no method with double argument
	}

}
