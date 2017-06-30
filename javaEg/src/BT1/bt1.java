package BT1;

public class bt1 {
	
	public int a;
	public int b;
	
	/*public void seta (int a) {this.a = a;}
	public int geta () {return this.a;}
	public void setb (int b) {this.b = b;}
	public int getb () {return this.b;}*/
	
	public static void main(String[] args) {
		bt1 b1 = new bt1();
//		b1.seta(5);
//		b1.setb(7);
//		swap(b1.geta(), b1.getb());
		b1.a =4;
		b1.b =5;
		System.out.println(b1.a + ", " + b1.b);
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}

