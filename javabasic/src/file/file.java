package file;

import java.io.File;
import java.io.IOException;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		File directory = new File("FolderTest");
		if(!file.exists() || !directory.exists()){
			try {
				directory.mkdir();
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Ten file hoac thu muc da bi trung");
		}
		
		
	}

}
