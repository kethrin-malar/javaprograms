package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			int i = fin.read();
			System.out.print((char) i);

			fin.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
