package oop;


public class oop_basic {
	
	public static void main (String[] args) {
		show();
		teach();
	}
	
	public static void show () {
		Student std = new Student();
		std.show();
	}
	public void study () {
		Student std = new Student();
		std.study();
	}
	public static void teach () {
		Teacher tc = new Teacher();
		tc.teach();
	}
}

interface Person {
	public final static String COUNTRY_NAME = "VIET NAM";
	
	public void show();
}

class Student implements Person{
	private String name;
	
	public void show () {
		System.out.println("show function in Student");
	}
	public void study () {
		System.out.println("study function inn Student");
	}
}

class Teacher extends Employee {
	public void teach () {
		System.out.println("teach function in Teacher");
	}
}

abstract class Employee {
	private String name;
	
	//public abstract void move();
	void move(){}
	void teach(){}
}

