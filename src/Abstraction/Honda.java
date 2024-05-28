package Abstraction;

public class Honda extends Bike {
	
	@Override
	 void run()
	 {
		 System.out.println("running safely..");
	}  
	
	public static void main(String[] args) {
		
		Honda h = new Honda();
		h.run();
		h.changeGear();
	
	}	
}
