package ExceptionExample1;

public class ExceptionDemo1 {
// first comment
	
	//second comment
	public static void main(String[] args) {

		System.out.println("Good Morning");

		int num1 = 10;
		int num2 = 0;
		int div = 0;

		div = num1 / num2;// 10/0 suspicious

		System.out.println("Division of num1/num2=" + div);

		System.out.println("How are you");

	}
}
