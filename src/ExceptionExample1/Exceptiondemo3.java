package ExceptionExample1;

public class Exceptiondemo3 {

	public static void main(String[] args) {
			System.out.println("Good Morning");

			int num1 = 10;
			int num2 = 0;
			int div = 0;

			try {

				div = num1/num2;
               } 
			catch (Exception e) {
				
				
	e.printStackTrace();
			}
			
	
finally {
	//this block of code will be executed any how, even there is an exception
	//This block will always comes with try and catch//or with try block
	//it always comes after catch(if using try+catch) or it will come after try(if we are using try block)
	System.out.println("----Finally block----");
	System.out.println(div);
}
}
}
