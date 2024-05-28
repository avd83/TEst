package PracticalExample;

public class StringToCharArray 
{
	public static void main(String[] args) {
		
		String st = "india is my country";
		for(int i=0;i<st.length();i++)
			{
				System.out.println(st.charAt(i));
			}
			System.out.println(st.contains(st));
			
		char[] arr = st.toCharArray();
		
		System.out.print(arr);
	}
}
