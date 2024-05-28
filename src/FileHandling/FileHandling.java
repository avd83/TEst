package FileHandling;

import java.io.*;
import java.io.IOException;

public class FileHandling {	
	public static void main(String[] args) {		
		File f = new File("C:\\Users\\Abhay\\Desktop\\test.doc");// to create new file
		try
		{
			if (f.createNewFile())
			{
				System.out.println("File Created Successfully..!");
				System.out.println("File Location:"+f.getAbsolutePath());
				System.out.println("File Name:"+f.getName());
				System.out.println("File Size : "+ f.length());
				System.out.println("File Readable : "+f.canRead());
				System.out.println("File Writtable : "+ f.canWrite());
				System.out.println("File exists : "+f.exists());
			//	System.out.println("File Deleted Successfully..!"+f.delete());				
			}
			else
			{
				System.out.println("File Already Exists..!");
			}
		}
		catch (IOException e)
		{
				System.out.println("Exception Handled...!");
		}
	}
}