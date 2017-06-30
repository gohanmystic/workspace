package oop;

public class inner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.show();
		o.sum(2, -6);
		
		C c1 = new C();
		c1.show();
	}

}

class Outer {

	public void show() {
		Inner i = new Inner();
		i.display();
	}

	public void sum(int a, int b) {
		Inner i = new Inner();
		int sum = i.sum(a, b);
		System.out.println(sum);
	}

	class Inner {

		public void display() {
			System.out.println("I am an inner class");
		}

		public int sum(int a, int b) {
			Inner_of_inner ii = new Inner_of_inner();
			return ii.sum(a, b);
		}

		class Inner_of_inner {
			public int sum(int a, int b) {
				return a + b;
			}
		}
	}
}
class C {
	public void show () {
		Outer.Inner in = new Outer().new Inner();
		in.display();
		System.out.println(in.sum(2, 3));
	}
}
