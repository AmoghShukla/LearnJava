package Random;

public class Test{
	public void m1(){
	System.out.println("no-args");
	}

	public void m1(int i){
	System.out.println("int-args");
	}
	
	public void m1(String s1){
	System.out.println("string-args");
	}
	
	public static void main(String[] args){
		Test t = new Test();
		t.m1(); //no-args
		t.m1(10); //int-args
		t.m1("Amogh"); //string-args 
	}
}
