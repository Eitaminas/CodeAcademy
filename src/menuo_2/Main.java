package menuo_2;

public class Main {

	public static void main(String[] args) {
    	

    	
    	
    	
    	
    	
    	
        Apple Apple_1 = new Apple("John", 6);
        Apple Apple_2 = new Apple(4);
        int sum = Apple_1.getMass() + Apple_2.getMass();
        System.out.println(sum);
        
        Dviratis dviratis1 = new Dviratis();
        Dviratis dviratis2 = new Dviratis();
        dviratis1.speed();
       
        
        
        if(dviratis1 > dviratis2) {
        	
        	System.out.println("dviratis1 more");
        	
        }else {
        	
        	System.out.println("dviratis2 more");
        	
        }
        

        	
        	

        
    }
}

// klasë
// objektas
// metodai
// konstruktorius
// void
// parametrai
// argumentai