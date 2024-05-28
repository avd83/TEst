package PracticalExample;

public class DuplicateCharacterInString {

	public static void main(String[] args) {

		//find duplicate character in string 
		 String string1 = "abhay";  
	        int count;  
	       	          
	        //Converts given string into character array  
	        char ch[] = string1.toCharArray();  
	          
	        System.out.println("Duplicate characters in a given string: ");  
	        //Counts each character present in the string  
	        for(int i = 0; i <ch.length; i++) 
	        {  
	            count = 1;  
	            for(int j = i+1; j <ch.length; j++) {  
	                if(ch[i] == ch[j] && ch[i] != ' ')
	                {  
	                    count++;  	                    
	                }  	                
	            }  
	          //A character is considered as duplicate if count is greater than 1  
	          //  if(count > 1 && ch[i] != '0')  
	                System.out.println(ch[i]+""+count);  
	        }  
	    }  

}
