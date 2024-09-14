package exceptionsample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class FileNotFoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
     File file = new File("D://File.txt");
     //FileReader fr = new FileReader(file);
     Scanner sc = new Scanner(file);
	}
	catch(FileNotFoundException e) {
		//System.out.println("Error");
		e.printStackTrace();
	}
	}

}
