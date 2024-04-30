package ExceptionExample1;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		int num1=20;
		int num2=0;
		//we can use multiple blocks with one try block.
		//Only one block of catch statement will be executed.
		//At the time of writing numbers exceptions, we have to use them as -->specialized to generalized form.
		//for expe===>ArithematicExpresssion NullPointerException  Exception
int div=0;
try {
	div=num1/num2;
}catch(NullPointerException e) {
	System.out.println("----first catch block----");
}
catch(ArithmeticException e) {
	System.out.println("----first catch block----");
}
	
	catch(Exception e) {
		System.out.println("----first catch block----");
	}
}
}
