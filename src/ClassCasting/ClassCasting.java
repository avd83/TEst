package ClassCasting;

public class ClassCasting {

	public static void main(String[] args) {
		
	Parent p = new Child();//Up casting		 
		//Parent p = new Parent ();
        p.name = "abhay";
        p.phoneNumber = 2345432123l;
        
        p.chat();
        
       Child c = (Child)p;//DownCasting
       //Child c = new Child();       	
        c.addUser();
	}
}
