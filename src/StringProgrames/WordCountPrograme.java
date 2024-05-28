package StringProgrames;

public class WordCountPrograme {

	public static void main(String[] args) {
		
		String s1= "Abhay is";		
		int wordsCount=0;
		
		for (int i=1;i<s1.length();i++)
		{
			if(s1.charAt(i) == ' ' && Character.isLetter(s1.charAt(i+1)) && (i > 0))
			{
				wordsCount++;
			}			
		}
		wordsCount++;
		System.out.println("Total number of words in the given string: " + wordsCount);
	}
}
