package oop;

class demo {
	public demo() {
		System.out.println("đây là hàm khởi tạo");
	}

	public demo(int a) {
		System.out.println("đây là hàm khởi tạo có đối số số nguyên: " + a);
	}

	static {
		System.out.println("Đây là khối khởi đầu vô danh");
		System.out.println("Chỉ được gọi 1 lần khi đối tượng đầu tiên của lớp được khởi tạo");
	}
	{
		System.out.println("Khối vô danh 1");
	}
	{
		System.out.println("Khối vô danh 2");
	}
	{
		System.out.println("Khối vô danh 3");
	}
}

public class start_block_static {
	public start_block_static() {
		System.out.println("đây là hàm khởi tạo");
	}

	public start_block_static(int a) {
		System.out.println("đây là hàm khởi tạo có đối số số nguyên: " + a);
	}

	static {
		System.out.println("Đây là khối khởi đầu vô danh");
		System.out.println("Chỉ được gọi 1 lần khi đối tượng đầu tiên của lớp được khởi tạo");
	}
	{
		System.out.println("Khối vô danh 1");
	}
	{
		System.out.println("Khối vô danh 2");
	}
	{
		System.out.println("Khối vô danh 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// class start_block_static 
		start_block_static sbs1 = new start_block_static();
		start_block_static sbs2 = new start_block_static();
		start_block_static sbs3 = new start_block_static(2);
		// class demo
		demo d1 = new demo();
		demo d2 = new demo();
		demo d3 = new demo(6);
	}

}
