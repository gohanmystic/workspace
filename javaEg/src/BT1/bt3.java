package BT1;

public class bt3 {
	private int a;
	public double b;
	
	public bt3 (int a, double b) {
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bt3 b1 = new bt3(10, 20.5);
		bt3 b2 = new bt3(10, 31.5);
		
		System.out.println(b1.a + ", " + b1.b);
	}

}
