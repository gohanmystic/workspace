package oop;

public class constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sup s1 = new Sup();
		Sup s2 = new Sup(5);
		
	}
}

class Supper{
	public Supper(){
		System.out.println("Supper");
	}
	public Supper(int a){
		System.out.println("Supper: " + a);
	}
}

class Sup extends Supper {
	public Sup(){
		System.out.println("Sub");
	}
	public Sup(int a){
		System.out.println("Sub: " + a);
	}
	
}
