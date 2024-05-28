package FileHandling;

import java.io.*;

public class FileReading {

	public static void main(String[] args) {
		try
		{			
			FileReader r = new FileReader("C:\\Users\\Abhay\\Desktop\\test.doc");// to read the data from file
			try
			{
			int i;
			while((i=r.read())!=-1)
			{
				System.out.print((char)i);
			}
			}
			finally
			{
				r.close();
				System.out.println(" File closed");
				
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		

	}

}
