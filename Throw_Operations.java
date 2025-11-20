package exception_Handling;

public class Throw_Operations {
/**
 *  you can have the multiple catch block with a single try block,but you have bear in the mind specific 
	 unique condition as try block can throw only a single exception at a time it became necessary to have
	 specific order in the catch block.
  ⏺️ let's say you have 2,3 children exception of the exception/runtime exception class  ->
	⭕ case 1:you will have to catch all the 2,3 custom exception in the catch block.
	⭕ case 2:you can directly handle the root exception & you won't have any need to handle the children exceptions.

*   Pipe Operator => symbol (|)
*   The pipe operator (|) is used in Java 7 onward to handle multiple exceptions in a single catch block.
*   This feature is called Multi-catch Exception Handling.
* 🧠 Rules of Pipe Operator ->
*   ✅ 1. Exceptions must NOT have a parent-child relationship
*   ✅ 2. Only one common exception variable is allowed
*   ✅ 3. The variable in a multi–catch is effectively final
*   
*/
	public static void main(String[] args) {
	
		// throw can only throw the sub-class of throwable.
		// throw can only throw a single exception at a time.
		
      int h = 23;
   // single try with multiple catch blocks   
      try {
    	    if(h< 10 && h > 0) {
    	    	  throw new Op1(); // used to create object of exception
    	    }
    	    else if(h < 20 && h > 10) {
    	    	 throw new Op2();
    	    }
    	    else if(h < 30 && h > 20) {
    	    	 throw new Op3();
    	    }
    	    else {
    	    	System.out.println("Enter the correct number.");
    	    }
      }
      
      // Root Exception
//      catch(Exception e) {   // multiple try with single catch block
//    	  System.out.println(e.getMessage());
//      }
      
      // Custom Exceptions
/*		catch(Op1 op) {
//			System.out.println(op.getMessage());
//			}
//        	catch(Op2 op) {
//        			System.out.println(op.getMessage());
//        		}
//        catch(Op3 op) {
//        			System.out.println(op.getMessage());
//        		}
//        catch(Exception e) {          // handle all exception work like default
//        			System.out.println(e.getMessage());
//        		}
*						OR
*/                        
       catch( Op1 | Op2 | Op3 ex ) {   // Multi-catch using pipe operator   (line 49 to 57 get reduces) 
    	      System.out.println(ex.getMessage());
       }
      
      finally {
    	  		System.out.println("Only one finally accepted...");
           }
		
	}

}
// Custom Exception
class Op1 extends Exception{
	Op1(){
		super("This is Op1");
	}
}
class Op2 extends Exception{
	Op2(){
		super("This is Op2");
	}
}
class Op3 extends Exception{
	Op3(){
		super("This is Op3");
	}
}