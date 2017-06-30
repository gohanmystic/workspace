package oop;

public class multi_classes {

	public static void main(String[] args) {
		A a1 = new A();
		a1.setName("Trần Vũ");
		System.out.println(a1.getName());
		
		A a2 = new A();
		a2.setName("Vũ Trần");
		System.out.println(a2.getName());
	}

}
class A {
	private String name;
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return this.name;
	}
}

class B {
	
}