package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		file2 f2 = new file2();
		String [] data = new String[4];
		data[0] = "TranQuocVu\n";
		data[1] = "14T1021258\n";
		data[2] = "CNTTK38A\n";
		data[3] = "0905874658\n";
		f2.writeFile(data);
		
	}
	public void writeFile (String[] data) {
		File file = new File("test.txt");
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(String d : data){
				bw.write(d);
			}			
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
