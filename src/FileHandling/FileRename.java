package FileHandling;

import java.io.*;

public class FileRename {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\Abhay\\Desktop\\test.doc");
		File r = new File("C:\\Users\\Abhay\\Desktop\\test1.doc");
		
		if(f.exists())
		{
			System.out.println(f.renameTo(r));
		}
		else
		{
			System.out.println("File not exists");
		}	
	}
}