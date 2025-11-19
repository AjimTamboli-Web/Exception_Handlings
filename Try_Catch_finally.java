package exception_Handling;

public class Try_Catch_finally {

	public static void main(String[] args) {
		
/*
 * Try => The "try" keyword is used to specify a block where we should place an exception code. 
          It means we can't use try block alone. The try block must be followed by either catch or finally.
 * Catch => The "catch" block is used to handle the exception. It must be preceded by try block which 
  			 means we can't use catch block alone. It can be followed by finally block later.   
 * finally => The "finally" block is used to execute the necessary code of the program.
  				 It is executed whether an exception is handled or not.
 *     
 */
		
		int[] a = {2,4,6};
		
		System.out.println(a[2]);
		
		// Contains risky code. Only one try is allowed in single try,catch block
		try { 
			System.out.println(a[4]);			
		}
		
		// Handles the exception. Multiple catch allowed, but: child exception must come before parent
		
		catch(ArithmeticException ar){  // child exception first 
			System.out.println("Arithmehtic");
		}
		catch(Exception e) {     // then parent
			System.out.println("Array =>>  " + e);
		}
		
		// finally is optional but only one
//         Always executes Used for:   ⏺️  close connection
//									   ⏺️  release memory
//										⏺️ close file
//		Even if exception occurs or try returns something.
//		Only one case finally doesn't run:	System.exit(0)		
		finally {     
			System.out.println("Always Show");
		}

	}

}
