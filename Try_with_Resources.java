package exception_Handling;

import java.util.Scanner;

public class Try_with_Resources {

	public static void main(String[] args) {
	    int s = 32;
	    System.out.println(s);
	    
	    // scanner implements Closeable which is implemented by AutoCloseable interface
	    
		try(Scanner scan = new Scanner(System.in)){
			int a = scan.nextInt();
			System.out.println(a);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("Excecuted anyway...");
		}
		
		
		// scan.close();   no need to close here
	}

}
