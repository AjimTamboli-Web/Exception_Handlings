package exception_Handling;

public class Throw_Exception {

	public static void main(String[] args) {
	
/*
 * throw: Used to explicitly throw a single exception. We use throw when something goes wrong 
           (or “shouldn’t happen”) and we want to stop normal flow and hand control to exception handling.
 *   Throw use for throw exception manually.  for custom logic with throw and new keyword    
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
			 throw new Error_Ex("Arithmethic Exception");  // you can say that it's using constructor
		}
		catch(Error_Ex e) {  // for creating object of class using reference
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("<<<<<<<<<<< THE END >>>>>>>>>>>");
		}
		
	}
}
/*
 * Custom exceptions you can create two types of custom exceptions in java
 * a) Checked - compile time custom exception
 * b) Unchecked - Runtime custom exception
 * The measure difference between these two is that in the compile time(Checked) you will be force to handle it at compile time
    with the try catch and finally block.
 *  while in the runtime or unchecked it's optional for you to write try catch and finally block.
 */
class Error_Ex extends Exception{
	Error_Ex(String s){ // constructor 
		super(s);  // calling parent parameterized constructor 
	}
}