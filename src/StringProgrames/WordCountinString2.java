package StringProgrames;

public class WordCountinString2 {

	public static void main(String[] args) {
		
		String str="abhay,vijay,Dere";
		int wordcount=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==',' ) {
				wordcount++;
			}			
		}
		wordcount++;
		System.out.println("Total number of words in the given string: " + wordcount);
	}
}
