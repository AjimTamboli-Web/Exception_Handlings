package exception_Handling;

public class Throw_Exception_Advanced {

	public static void main(String[] args) {
		
		int i = 5;
		int j = 33;
		
	// when you write first Exception or compile-time exception  and later write second Runtime exception
	// it will show both exceptions other wise it run only Runtime exceptions, compile-time will be ignored
	// that's why sequence is mattered.	
		
		try {  // 1st Compile-time exception call
			  if(j > 30) {
				throw new Advanced_Ex2();
			}
			}
			catch(Advanced_Ex2 ad) {
				System.out.println(ad.getMessage());
			}
			finally {
				System.out.println("This is optional when you're using catch block with try");
			}
		
		
		if(i < 32) {  // 2nd Run-time exception call
			System.out.println("Wake up exception");
			throw new Advanced_Ex();  // direct calling on new object
		}
		else {
			System.out.println("No Exception Wake....");
		}
		
	
		
	}

}

// If you are using RuntimeException there will be no need for try catch block other wise it's compulsory
//    for other exceptions like (Exception itself or compile-time exception)
// Custom Exception
class Advanced_Ex extends RuntimeException{
	Advanced_Ex(){
		super("This is RunTime-Exception....");
		System.out.println("There is no need try catch block...");
	}
}

class Advanced_Ex2 extends Exception{
	Advanced_Ex2(){
		super("This is Exception...");
		System.out.println("There is compulsory to implement try-catch block...");
	}
}
