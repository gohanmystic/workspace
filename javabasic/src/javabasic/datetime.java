package javabasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datetime {

	public static void main(String[] args) {
		// get time by millisecond
		long start = System.currentTimeMillis();

		try {
			for (int i = 0; i < 1000; i++) {
				Thread.sleep(2);
			}
		} catch (Exception e) {
			
		}

		long end = System.currentTimeMillis();

		System.out.println(end - start);
		
		// get time by nanosecond
		start = System.nanoTime();
		end  = System.nanoTime();
		
		System.out.println(end - start);
		
		//Display system time
		SimpleDateFormat dateFormat 	= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
		Date date				= new Date();
		
		String day				= dateFormat.format(date);
		
		System.out.println(day);
	}

}
