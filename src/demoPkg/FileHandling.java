package demoPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling 
{
	
	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./TestData/data.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("name"));
		
		System.out.println(prop.get("url"));
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nthis is forth line");
		fw.flush();  //save
		fw.close();
		
	}

	public static void readData() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Documents\\abc.txt");
		
		File f = new File("./TestData/abc.txt");  //file connection
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();  //84
		
		while(r!=-1)  //84, 104
		{
			System.out.print((char)r);// Th
			r = fr.read(); 
		}
		
	}
	
	public static void main(String[] args) throws Exception
	{
	
		//FileHandling.readData();
		FileHandling.readprop();
		
	}
	
}
