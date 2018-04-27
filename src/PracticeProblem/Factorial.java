package PracticeProblem;
import java.util.Scanner;

public class Factorial {
	
	
public static void main(String [] arg){
		
	int input = 3;
	String line ="";
	
	System.out.println("Enter a postive Integer : ");
	try {
		Scanner sc = new Scanner(System.in);
		line = sc.nextLine();
		
		   while (!"quit".equalsIgnoreCase(line)) {
			   
			   
			   
		        try {
		            input = Integer.parseInt(line);
		            if (input > 0) {
		            	
		            	int z = fact(input);
		            	System.out.println("Factorial of " + input + " is : " + z);	
		            }
		        System.out.println("Enter a postive Integer : ");
		        line = sc.nextLine();
		        /*sc.next();
		    	line = sc.nextLine();*/
		            
		        } catch (NumberFormatException e) {
		            // ok to ignore: let it fall through to print error message and try next line
		        	System.out.print("Error: input must be a positive integer.\n" );
		        	System.out.println(e.getMessage());
		        	break;
		        }
		        
		    }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.getMessage();
		System.out.println("Error: Program Exiting");
		
	}
	
	System.out.println("End Of Factorial Program");
	
	
	
	}
	
	
/*public static String reverse(String n){
		
		if (n.length()==1){
			return n;
		}
		
		return n.charAt(n.length()-1) + reverse(n.substring(0,n.length()-1));
		
	}*/
	
	
public static int fact(int x){
	if (x ==1){
		
		return 1;
	}
	
	if ( x==2){
		
		return 2;
	}

	return x*fact(x-1);
	

}


}
