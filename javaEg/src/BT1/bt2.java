package BT1;

public class bt2 {
	public double lat;
	public double lon;

	public bt2(double latIn, double lonIn) {
		this.lat = latIn;
		this.lon = lonIn;
	}
	
	public static void main(String[] args) {
		bt2 loc1 = new bt2(39.9, 116.4);
		bt2 loc2 = new bt2(55.8, 37.6);
		bt2 loc3 = new bt2(14.3, 33.2);
		bt2 loc4 = new bt2(99.3, 124.2);
		loc1 = loc2;
		loc3 = loc4;
		loc1.lat = 22.4;
		loc3.lat = -118.3;
		System.out.println(loc1.lat + ", " + loc1.lon);
		System.out.println(loc2.lat + ", " + loc2.lon);
		System.out.println(loc3.lat + ", " + loc3.lon);
		System.out.println(loc4.lat + ", " + loc4.lon);

	}

}
