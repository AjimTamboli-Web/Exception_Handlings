package exception_Handling;

public class Throw_Exception {

	public static void main(String[] args) {
	
/*
 * throw: Used to explicitly throw a single exception. We use throw when something goes wrong 
           (or “shouldn’t happen”) and we want to stop normal flow and hand control to exception handling.
 *   Throw use for throw exception manually.      
 */
		System.out.println(">>>>>>>>>>>> Start <<<<<<<<<<<<<<<");
		
		String ex = null;
		
/*		int age = 12;    // you can throw without try catch block because throw is Runtime Exception
		if(age < 18) {
			throw new ArithmeticException("Age must be above 18");
		}
*/		
		
		try {
//			System.out.println(ex.length());	
			if(ex == null) {
				throw new Error_Ex("Null Exception");	 // You create an exception object and throw it yourself.			
			}
			
			System.out.println("All ok to proceed.");   // Dead code 
		}
		
		catch(Error_Ex e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("<<<<<<<<<< The End >>>>>>>>>>");
		}

		try {
			int i = 10/0;
			 throw new Error_Ex("Arithmethic Exception");
		}
		catch(Error_Ex e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("<<<<<<<<<<< THE END >>>>>>>>>>>");
		}
		
	}
}

class Error_Ex extends Exception{
	Error_Ex(String s){
		super(s);
	}
}