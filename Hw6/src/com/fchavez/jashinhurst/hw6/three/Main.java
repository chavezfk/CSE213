package com.fchavez.jashinhurst.hw6.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Main class for the program. I added the throws exceptions because it 
	 * was simpler than a large number of try catches
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String read;
			FileInputStream fin = new FileInputStream("periodic.txt");
			InputStreamReader file = new InputStreamReader(fin);
			BufferedReader in = new BufferedReader(file);
			File outfile = new File("abundance.bin");
			FileWriter wout = new FileWriter(outfile);
			BufferedWriter pout = new BufferedWriter(wout);
			FileOutputStream fout = new FileOutputStream(outfile);
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			ArrayList<Element> elements = new ArrayList<Element>();
			
			//skip the first 21 lines of the periodic file
			for(int count = 0; count < 21; count++){
					read = in.readLine();
			}
			while((read = in.readLine())!=null){
				add(elements, read);
			}
			Comparator<Element> c = new Comparator<Element>() {
				
				/*@Override public int compare(Element o, Element o2) {
					return o.getName().compareTo(o2.getName());
				}*/
				@Override public int compare(Element o, Element o2) {
					Double n = (Double) o.getTerrestrialAbundance();
					Double n2 = (Double) o2.getTerrestrialAbundance();
					return n.compareTo(n2);
				}
			};
			elements.sort(c);
			for(Element e : elements){
				//pout.write(e.getName() + "\n");
				oout.writeObject(e);
			}
			
			wout.close();
			fout.close();
			pout.close();
			oout.close();
			
			wout = new FileWriter("abundance.txt");
			pout = new BufferedWriter(wout);
			//fout = new FileOutputStream("abundance.txt");
			//oout = new ObjectOutputStream(fout);
			File objIn = new File("abundance.bin");
			FileInputStream inStream = new FileInputStream(objIn);
			ObjectInputStream oIn = new ObjectInputStream(inStream);
			Element e;
			try {
				for(int count = 0; count < elements.size(); count++){
					e = (Element)oIn.readObject();
					pout.write(e.getName() + "\n");
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			pout.close();
			inStream.close();
			oIn.close();
			//fout.close();
			//oout.close();
	}

	private static void add(ArrayList<Element> elements, String read) {
		StringTokenizer st = new StringTokenizer(read, " ");
		int count = 0;
		String[] n = new String[10];
		if(st.countTokens() !=0){
			while(st.hasMoreTokens()){
				n[count] = st.nextToken();
				count++;
			}
			addToElements(elements,n);
		}	
	}

	private static void addToElements(ArrayList<Element> elements, String[] n) {
		elements.add(new Element(n[0],
				n[1],
				Integer.parseInt(n[2]),
				Integer.parseInt(n[3]),
				Integer.parseInt(n[4]),
				Double.parseDouble(n[5]),
				Double.parseDouble(n[6]),
				Double.parseDouble(n[7]),
				Double.parseDouble(n[8]),
				Double.parseDouble(n[9])));
				
	}
}