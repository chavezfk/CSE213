package src.com.fchavez.jashinhurst.hw6.one;

import java.io.*;

public class Ascii {

	public static void main(String[] args) {

		byte [] byteArray = {(byte) 'A', (byte) 'B', (byte) 'C', (byte) 'a', 
				(byte) 'b', (byte) 'c'};      

		File file = new File("ascii.txt");

		try {

			FileOutputStream fos = new FileOutputStream(file);
			//write one byte at a time
			for (int i = 0; i < byteArray.length; i++) {
				fos.write(byteArray[i]);
			}
			fos.write(byteArray[2]);  
			fos.close();

			FileInputStream fis = new FileInputStream(file);
			int filesize = (int) file.length();
			byte[] newByteArray = new byte[filesize];
			fis.read(newByteArray);
			fis.close();

			for (int i = 0; i < filesize; i++) {
				System.out.print((char) newByteArray[i] + " ");
				System.out.print(newByteArray[i] + " ");
			}
		} 
		catch (FileNotFoundException e) {     
			e.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
