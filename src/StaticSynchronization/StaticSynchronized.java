package StaticSynchronization;

public class StaticSynchronized {	
	public static void main(String[] args) {
		
		Bank obj = new Bank(5000);
		
		Thread1 t1= new Thread1(obj);
		Thread2 t2= new Thread2(obj);
		
		t1.setName("abhay");;
		t2.setName("apoorv");;
		
		t1.start();
		t2.start();
		
		Bank obj2 = new Bank(5000);
		
		Thread3 t3=new Thread3(obj2);
		Thread4 t4=new Thread4(obj2);
		
		t3.setName("mhika");;
		t4.setName("mitansh");;
	}

}
