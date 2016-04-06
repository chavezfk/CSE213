package com.fchavez.jashinhurst.hw6.two;

import java.io.*;
/**
 * generates KML file for google earth given a set of coordinates
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @todo none
 * @version 1.0
 *
 */
public class KMLGenerator {
	public static void main(String args[]) {
		FileWriter fos = null;
		PrintWriter pw = null;
		int i = 1;
		File in = new File("location.txt");
		File out = new File("location.kml");
		String top = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<kml xmlns=\"http://earth.google.com/kml/2.1\">\n<Document>\n   <name>Mystery Locations</name>\n";
		String bot = "</Document>\n</kml>";
		String write = null;
		FileReader fr = null;
		try {
			fr = new FileReader(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader bufRead = new BufferedReader(fr);
		String str = null;
		
		try {
			fos = new FileWriter(out);
			pw = new PrintWriter(fos);
			pw.print(top);
			System.out.print(top);
			bufRead.readLine();
			while(true) {
				if(!bufRead.ready()) {
					break;
				}
				str = bufRead.readLine();
				String[] coord = str.split(" \\|");
				write = "   <Placemark>\n      <name>Location " + i + "</name>\n      <Point>\n";
				write += "         <coordinates>" + coord[0] + "," + coord[1] + ",0</coordinates>\n";
				write += "      </Point>\n   </Placemark>\n";
				pw.print(write);
				System.out.print(write);
				i++;
			}
			pw.print(bot);
			System.out.print(bot);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			pw.close();
		}
	}
}
