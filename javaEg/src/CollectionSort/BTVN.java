package CollectionSort;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BTVN {
	public List<TongThong> ListBauCu = new ArrayList<>();
	public Set<TongThong> TreeBauCu = new TreeSet<>(new Comparator<TongThong>() {

		@Override
		public int compare(TongThong o1, TongThong o2) {
			return o1.getName().compareToIgnoreCase(o2.getName());
		}
	});
	// đọc dữ liệu từ file ListBauCu.txt
	public void ReadFile () {
		try {
			FileInputStream FIS = new FileInputStream("ListBauCu.txt");
			InputStreamReader ISR = new InputStreamReader(FIS);
			BufferedReader BRListBauCu = new BufferedReader(ISR);
			
			while (true) {
				String st = BRListBauCu.readLine();
				if(st == "" || st == null || st.isEmpty()) break;
				TongThong tt = new TongThong(st);
				ListBauCu.add(tt); //đưa dữ liệu vào ListBauCu
			}
			TreeBauCu.addAll(ListBauCu); //đưa dữ liệu từ ListBauCu vào TreeBauCu (không dupplicate dữ liệu)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ShowList () {
		//2 vòng for này để đếm số phiếu của mỗi Tổng thống
		for (TongThong name : TreeBauCu) {
			for (TongThong listName : ListBauCu) {
				if(name.getName().equalsIgnoreCase(listName.getName())){
					name.SoPhieu++;
				}
			}
		}
		
		//sắp xếp tổng thống giảm giần theo số phiếu
		//vì Collections.sort không dùng được cho TreeSet nên phải convert TreeSet sang List
		ListBauCu.removeAll(ListBauCu);
		ListBauCu.addAll(TreeBauCu);
		Collections.sort(ListBauCu, new Comparator<TongThong>() {
			@Override
			public int compare(TongThong o1, TongThong o2) {
				if(o1.getSoPhieu() > o2.getSoPhieu()){
					return -1;
				}else if(o1.getSoPhieu() == o2.getSoPhieu()){
					return 0;
				}else{
					return 1;
				}
			}
		});
		
		System.out.println("Tổng thống được nhiều phiếu nhất là " + ListBauCu.get(0).getName() + " với tổng số phiếu là " + ListBauCu.get(0).getSoPhieu());
	}
	public static void main(String[] args) {
		BTVN btvn = new BTVN();
		btvn.ReadFile();
		btvn.ShowList();
	}

}
