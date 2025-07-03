package Java;

class Animal{
}

class Monkey extends Animal{	
}

public class OverloadingCase5 {
	public void m1(Animal a) {
		System.out.println("Animal Version");
	}
	
	public void m1(Monkey m) {
		System.out.println("Monkey Version");
	}

	public static void main(String[] args) {
		OverloadingCase5 oc5 = new OverloadingCase5();
		Animal a = new Animal();
		Monkey m = new Monkey();
		oc5.m1(a); // Calls the Animal version
		oc5.m1(m); // Calls the Monkey version
		oc5.m1(null); // Calls the Animal version due to method resolution rules

	}

}
