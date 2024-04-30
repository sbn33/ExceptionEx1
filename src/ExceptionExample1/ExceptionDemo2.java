package ExceptionExample1;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Good Morning");

		int num1 = 10;
		int num2 = 0;
		int div = 0;

		try {
			// set of statements which may throw an exception()

			div = num1 / num2;// suspicious

		} catch (Exception e) {
			// handling the exception
			// here we can write our solution.
			// it is executed only if exception occurred, otherwise not.
			// means this block of code will be executed, if we get an exception.

			System.out.println(e.getMessage());// brief info about an exception
e.printStackTrace();
		}
		System.out.println("Division of num1/num2="+div);
		System.out.println("How are you");
		

	}
}
