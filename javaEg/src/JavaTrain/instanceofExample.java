package JavaTrain;

import java.util.List;
import java.util.ArrayList;
interface Animal{
	public void show();
}

class Dog implements Animal{
	public void show(){
		System.out.println("Shape");
	}
}

public class instanceofExample {
	public static void main(String[] args) {
		Dog shape = new Dog();
		List<Object> lists = new ArrayList<Object>();
		lists.add(2.2f);
		lists.add("Tran");
		lists.add(1);
		lists.add("Quoc");
		lists.add("Vu");
		lists.add(2.2);
		lists.add(shape);
		for (Object list : lists) {
			if (list instanceof String) {
				System.out.println(list + ": String");
			} else if (list instanceof Integer) {
				System.out.println(list + ": Integer");
			} else if (list instanceof Float) {
				System.out.println(list + ": Float");
			} else if (list instanceof Double) {
				System.out.println(list + ": Double");
			} else if (list instanceof Animal) {
				((Dog) list).show();
			}
		}
	}
}
