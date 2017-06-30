package FileExample;

import java.io.BufferedReader; // doc file
import java.io.FileInputStream; // doc file
import java.io.FileNotFoundException;
import java.io.FileOutputStream; // ghi file
import java.io.IOException; 
import java.io.InputStreamReader; // doc file
import java.io.OutputStreamWriter; // ghi file
import java.io.PrintWriter; //ghi file
import java.util.ArrayList; // array list
import java.util.Random; // random

public class FileExample {
	
	public void ReadFile () {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			ArrayList <Double> HSLList 	= new ArrayList<>();
			ArrayList <String> NameList = new ArrayList<>(); 
			
			Double hsl;
			double TotalHsl = 0;
			
			while (true) {
				try {
					String st = br.readLine();
					if(st == null || st == "") break;
					
					String [] result = st.split("[;]");
					NameList.add(result[1]);
					
					hsl = Double.parseDouble(result[2]);
					
					TotalHsl += hsl;
					
					HSLList.add(hsl);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			for (int i = 0; i < NameList.size(); i++) {
				System.out.println(i + " - " + NameList.get(i) + " - " + HSLList.get(i));
			}
			System.out.println("Trung binh He So Luong: " + TotalHsl/NameList.size());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void WriteFile () {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt", true); // mở file
			OutputStreamWriter osw = new OutputStreamWriter(fos); // 
			
			PrintWriter write = new PrintWriter(osw);
			
			String[] Ho 	= {"Tran", "Nguyen", "Le", "Phan"};
			String[] HoDem	= {"Quoc", "Van", "Thi", "Dinh", "Son"};
			String[] Ten 	= {"Vu", "Hung", "Kim", "Ngan", "Thuy", "Son"};
			
			int ddHo 	= Ho.length;
			int ddHoDem = HoDem.length;
			int ddTen 	= Ten.length;
			
			Random r = new Random();
			
			for (int i = 0; i < 100; i++) {
				String RandomHo 	= Ho[r.nextInt(ddHo - 1)];
				String RandomHoDem 	= HoDem[r.nextInt(ddHoDem - 1)];
				String RandomTen 	= Ten[r.nextInt(ddTen - 1)];
				double RandomHSL	= r.nextDouble() * 10;
				
				write.println(i + ";" +RandomHo+RandomHoDem+ RandomTen + ";" + RandomHSL);
			}
			
			write.close(); // đóng file
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
