package practiceproblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotBoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("D:\\hello.txt");
			FileReader fr = new FileReader(file);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
