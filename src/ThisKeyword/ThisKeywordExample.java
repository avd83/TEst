package ThisKeyword;

public class ThisKeywordExample {
	
	int i;
	
	void setValues(int i)
	{
		this.i=i;
	}
	void show()
	{
		System.out.println(i);
	}

	public static void main(String[] args) 
	{
		ThisKeywordExample tk = new ThisKeywordExample();
		tk.setValues(4);
		tk.show();		
	}
}