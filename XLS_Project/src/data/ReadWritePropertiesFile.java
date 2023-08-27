package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fi = new FileInputStream("C:\\QA\\Testing\\prop.properties");
		Properties p = new Properties();
		p.load(fi);
		
		System.out.println(p.getProperty("browser"));
		
		String incorrectEmail = p.getProperty("incorrectemail");
		System.out.println(incorrectEmail);
		
		System.out.println(p.getProperty("url"));
		
		System.out.println(p.getProperty("correctEmail"));
		
		p.setProperty("tool", "Selenium");
		System.out.println(p.getProperty("tool"));
		
		p.setProperty("testing", "automation");
		System.out.println(p.getProperty("testing"));
		
		FileOutputStream fo = new FileOutputStream("C:\\QA\\Testing\\prop.properties");
		p.store(fo, "Made changes to the file");
	}

}
