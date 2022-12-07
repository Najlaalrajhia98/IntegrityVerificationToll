import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class HashGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int userAction=0;
		Scanner enter = new Scanner(System.in);
		System.out.println("select an action");
		userAction = enter.nextInt();  
	    
	    if (userAction==1) {
	       System.out.println("generte Hash"); 
		} 
	    else if (userAction==2) { 
			System.out.println("Compare Hash"); 
	    } 
	    else if (userAction==3) { 
	    	System.out.println("Re-compute"); 
	    } 
	    else { 
	    	System.out.println("wronge selection"); 
	    }
	} 
}

