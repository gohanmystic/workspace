package javabasic;

public class myENUM {
	enum COLOR {
		GREEN(3), BLUE(1), RED(2), YELLOW(4);
		private int value;
		COLOR (int value) {
			this.value = value;
		}
		public int getValue() {
			return this.value;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COLOR c = COLOR.RED;
		
		//System.out.println(c.compareTo(COLOR.RED));
		System.out.println(c + " : " + c.value);
	}

}
