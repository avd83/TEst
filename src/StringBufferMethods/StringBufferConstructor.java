package StringBufferMethods;

public class StringBufferConstructor {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());//default capacity of stringbuffer class is 16
		
		StringBuffer sb1 = new StringBuffer("abhay");
		System.out.println(sb1.capacity());//default capacity of stringbuffer class is 16+5=21
		
		sb1.append(" vijaykumar");
		System.out.println(sb1.capacity());
		
		sb1.append(" Dere ");
		System.out.println(sb1.capacity());// if old capacity is full then capacity of object is increased (old capacity*2)+2 = 44
	}

}
