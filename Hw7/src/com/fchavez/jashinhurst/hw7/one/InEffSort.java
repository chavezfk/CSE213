package com.fchavez.jashinhurst.hw7.one;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

/**
 * <p> A simple program that implements a very
 * inefficient sorting algorithm that consists
 * of three steps. </p>
 * 
 * <p> The steps are as follows:</b>
 * 1: find a smallest integer in a list by checking every single element</b>
 * 2: remove that integer and write it to a file
 * 3: after finished walking the list, read the file and print it out </b>
 * </p>
 * 
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw7 #1
 * @bugs None
 */
public class InEffSort {
	
	public static void main (String[] args){
		LinkedList<Integer> list = new LinkedList<>();
		try {
			FileOutputStream fout = new FileOutputStream("sorted.bin");
			FileInputStream fin = new FileInputStream("sorted.bin");
		
			
			DataOutputStream out = new DataOutputStream(fout);
			DataInputStream in = new DataInputStream(fin);
			
			Integer min;
			for(int count = 0; count < 10000; count++){
				list.add((Integer)(int)Math.floor(Math.random() * 1000000));
			}
			
			while(list.size() > 0){
				min = Collections.min(list);
				out.writeInt(min.intValue());
				list.remove(min);
			}
			int i;
			for(i = 0; i < 10; i++){
				System.out.println(in.readInt());
			}
			System.out.println("...");
			for( ; i < 10000-10; i++){
				in.readInt();
			}
			for(; i < 10000; i++){
				System.out.println(in.readInt());
			}
			in.close();
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
