package exceptionsample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	  File f = new File("D://Hello.txt");
	  FileReader fr = new FileReader(f);
	  
	 
	 
  }catch(FileNotFoundException e) {
	  System.out.println("error occured");
  }
	}

}
