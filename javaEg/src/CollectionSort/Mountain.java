package CollectionSort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Mountain implements Comparable<Mountain>{
	public String MountainName;
	public int MountainHeight;
	Mountain(){
		
	}
	Mountain(String MountainName, int MountainHeight) {
		this.MountainName = MountainName;
		this.MountainHeight = MountainHeight;
	}
	public String getMountainName(){
		return this.MountainName;
	}
	public int getMountainHeight(){
		return this.MountainHeight;
	}
	
	@Override
	public int compareTo(Mountain o) {
		return MountainName.compareTo(o.MountainName);
	}
	
	@Override
	public String toString() {
		return "Mountain [MountainName=" + MountainName + ", MountainHeight=" + MountainHeight + "]";
	}
	public static void main(String[] args){
		List<Mountain> mtn = new ArrayList<>();
		mtn.add(new Mountain("Longs", 14255));
		mtn.add(new Mountain("Elbert", 14433));
		mtn.add(new Mountain("Maroon", 14156));
		mtn.add(new Mountain("Castle", 14265));
		MountainHeightSort mhs = new MountainHeightSort();
		Collections.sort(mtn, mhs);
		long a = 1;
		
		System.out.println(a);
		System.out.println(mtn.toString());
		
	}
}
