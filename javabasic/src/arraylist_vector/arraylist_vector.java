package arraylist_vector;

import java.util.ArrayList;
import java.util.Vector;

public class arraylist_vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Tran Quoc Vu");
		al.add("14T1021258");
		al.add("CNTTK38A");
		al.add("0905874658");
		
		al.remove(2);
		Object[] array = al.toArray();
		
		System.out.println(array.length);
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		Vector<String> vt = new Vector<String>();
		vt.add("Tran Quoc Vu");
		vt.add("Tran Quoc Vu");
		vt.add("Tran Quoc Vu");
		vt.add("Tran Quoc Vu");
		
		for (int i = 0; i < vt.size(); i++) {
			System.out.println(vt.get(i));
		}
	}

}
