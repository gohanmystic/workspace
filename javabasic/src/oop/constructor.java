package oop;
interface test {
	public void show();
}

public class constructor implements test{

	public void show(){
		
	}
	public constructor () {
		System.out.println("day la ham tao khong doi");
	}
	public constructor (String str) {
		//
		//System.out.println("Day la ham tao doi chuoi: " + str);
		this();
	}
	public constructor (int a) {
		System.out.println("Day la ham tao doi so nguyen: " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor constr = new constructor("Hello");
		constructor constr2 = new constructor(2);
	}

}
