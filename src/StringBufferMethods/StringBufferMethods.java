package StringBufferMethods;

public class StringBufferMethods {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(20);//to set the capacity of the objects
		System.out.println(sb.capacity());
		
		sb.append("Abhay Vijaykumar Dere");
		sb.trimToSize();// after this wastage capacity will remove from the object
		System.out.println(sb.capacity());
		
		System.out.println(sb.charAt(10));
		System.out.println(sb.delete(6, 17));
		System.out.println(sb.deleteCharAt(6));
		System.out.println(sb.indexOf("A"));
		System.out.println(sb.isEmpty());
	}

}
