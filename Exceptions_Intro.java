package exception_Handling;

public class Exceptions_Intro {

	public static void main(String[] args) {
	
/*
 * Exception handling is a mechanism to handle runtime errors,allowing the normal flow of a program to continue.
 * Exceptions are events that occur during program execution that disrupt the normal flow of instructions.
 * Exception = Unwanted event that stops the normal flow of the program.To prevent program crash and to handle errors in a controlled way.
 * Example: ⭕Dividing by zero  ⭕File not found   ⭕Invalid input  ⭕Null reference (NullPointerException)		
 * When an exception occurs, it is typically represented by an object of a subclass of the java.lang.Exception class.
 * 
 * Types of Exception :
 *   ⏺️  Checked Exceptions  (Compile time)  =>> Must be handled using try-catch or throws.
 *   ⏺️  Unchecked Exceptions(Runtime)    =>> No compile-time checking.
 *   ⏺️  Errors (Serious Problems - not exception) =>> You cannot handle errors. They indicate system failure.
 *   
 * Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.
 *  
 * Try - The try block contains a set of statements where an exception can occur.
 * Catch - The catch block is used to handle the uncertain condition of a try block. A try block is always followed by a catch block, 
 *            which handles the exception that occurs in the associated try block.  
 *   
 */
		
		System.out.println("Hellow");
		
	// The try block contains a set of statements where an exception can occur.	
		try{
	     // This will throw an ArithmeticException	
		int result = 10 / 0;   // Runtime exception ( / by zero)
		System.out.println(result);
		}
		
		 // Here we are Handling the exception
		catch(Exception e) {
			System.out.println("Error:  " + e);
		}
		
		 // This line will executes weather an exception occurs or not
        System.out.println("This line want to be executed.");
	}

}
