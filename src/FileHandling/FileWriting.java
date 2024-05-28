package FileHandling;

import java.io.*;
public class FileWriting {

public static void main(String[] args) throws IOException
{
	try
	{
	FileWriter f = new FileWriter("C:\\Users\\Abhay\\Desktop\\test.doc");// to write the data in file
		try
		{		
			f.write("abhay is leainging the java1 \n ");
			System.out.println("Data Written in the file");
		}
		finally
		{
				f.close();
		}
	}
	catch (IOException e)
		{
			System.out.println(e);
		}	
	}
}
