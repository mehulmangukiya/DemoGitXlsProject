package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\QA\\Testing\\temp.txt");
		f.createNewFile();
		
		//Write into Text file
				FileWriter w = new FileWriter(f);
				BufferedWriter out = new BufferedWriter(w);
				
				out.write("This is 1st Line");
				out.newLine();
				out.write("This is 2nd Line");
				out.newLine();
				out.write("This is 3rd Line");
				out.newLine();
				out.write("This is 4th Line");
				out.newLine();
				out.write("This is 5th Line");
				out.flush();
				
				FileReader r = new FileReader(f);
				BufferedReader rd = new BufferedReader(r);
				
				String s;
				int i=0;
				while((s=rd.readLine()) != null) {
					System.out.println(s);
					i++;
				}
				System.out.println("Number of lines: " + i);
				
				/*System.out.println(rd.readLine());
				System.out.println(rd.readLine());
				System.out.println(rd.readLine());
				System.out.println(rd.readLine());
				System.out.println(rd.readLine());
				System.out.println(rd.readLine());
				System.out.println(rd.readLine());*/
				
	}

}
