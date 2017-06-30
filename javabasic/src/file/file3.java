package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file3 {

	public static void main(String[] args) {
		file3 f3 = new file3();
//		System.out.println(f3.ReadFile("test.txt"));
		f3.ReadFile("test.txt");
	}
	public void ReadFile (String fileName) {
		
		File file = new File(fileName);
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String data = new String();
//			String result = new String();
			
			while ((data = br.readLine()) != null ) {
				System.out.println(data);
			}
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			
		}
	}

}
