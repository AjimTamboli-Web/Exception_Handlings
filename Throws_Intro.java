package exception_Handling;

public class Throws_Intro {

	public static void main(String[] args)throws InterruptedException {
		
/**
 * throws-> ⭕ throws is a keyword in Java that is used in the signature of a method to indicate that this method
               might throw one or more exceptions.It tells the compiler and the caller to handle the exception. 	
 *          ⭕ The caller to these methods has to handle the exception using a try-catch block.   
 *  ⭕ where, exception_list is a comma separated list of all the exceptions which a method might throw.
 *  ⭕ throws does NOT handle the exception — it only passes it to the calling method.
 *   Feature					throw						throws
	Use				To manually throw exception		To declare exception
	Position				Inside method				  Method signature
	Number			  Only one object thrown			Multiple exceptions allowed
	Purpose				Creating exception			Passing exception
	Example				throw new Exception();		throws IOException, SQLException 
	 
 * ☑️ Where is throws required?  ->   Only for checked exceptions	     
 * 
 */

		Thread.sleep(10000);
		System.out.println("Hellooowwww");
 // by using the throws keyword we handled the InterruptedException and we will get the output as Hellooowwww.
		
	}

}
