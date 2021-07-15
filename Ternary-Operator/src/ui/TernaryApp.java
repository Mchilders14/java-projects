package ui;

public class TernaryApp {

	public static void main(String[] args) {
		int num = 7;
		String msg = "";
		if(num > 10) {
			msg = "Number is greater than 10";
		}
		else {
			msg = "Number is less than or equal to 10";
		}
		System.out.println(msg);
		
		System.out.println("Ternary version: ");
		
		String msg2 = num > 10 ? "Number is greater than 10" : "Number <= 10";
		
		System.out.println(msg2);
		
		String msg3 = num > 10 ? "Number is greater than 10" 
				  : (num > 5 ? "Number is greater than 5" : "Number is less than equal to 5");
		
		System.out.println(msg3);
		
		String msg4 = num % 2 == 1 ? "Number is odd, times 2 = " +timeTwo(num)
				  : "Number is even!";
		
		System.out.println(msg4);
		
	}
	
	private static int timeTwo(int i) {
		return i*2;
	}

}
