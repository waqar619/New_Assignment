package exception.main;

public class ExceptionMain {

	public static void main(String[] args) {
		int arrayofint[] = {20,15,10,8,6,};
		
	try {	
		System.out.println("Value at index 0 is: "+ arrayofint[0]);
		System.out.println("Value at index 3 is: "+ arrayofint[3]);
		System.out.println("Value at index 4 is: "+ arrayofint[4]);
		System.out.println("Value at index 5 is: "+ arrayofint[5]);
		
	} catch(ArrayIndexOutOfBoundsException f) {
		System.out.println("Hey user value is not present");
	}

	}

}
