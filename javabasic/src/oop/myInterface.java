package oop;

public class myInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager man = new Manager();
		man.show();
	}

}

interface Human {
	public static final int AVG_AGE = 100;
	int AVG_WEIGHT = 60;
	
	public abstract void show();
	void display();
}

class Manager implements Human {

	@Override
	public void show() {
		System.out.println("AVG_AGE = " + AVG_AGE);		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}

