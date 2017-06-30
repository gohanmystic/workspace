package DateAndTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			String day1 = br.readLine();
			String day2 = br.readLine();
			
			SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
			
			//đổi chuổi sang ngày trong java (java.util.Date)
			/*Date d1 = f.parse(day1);
			Date d2 = f.parse(day2);*/
			
			//đổi chuổi sang ngày trong sql (java.
			Timestamp d1 = new Timestamp(f.parse(day1).getTime());
			Timestamp d2 = new Timestamp(f.parse(day2).getTime());
			
			long hieu = d2.getTime() - d1.getTime();			
			long SoGiay = hieu/1000;
			
			System.out.println("Khoang cach giua ngay " + f.format(d1) + " den ngay " + f.format(d2) + " la: " + SoGiay + "(s)");	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

}

