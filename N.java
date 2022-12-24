class N 
{
	public static void main(String[] args) 
	{
		// Take a multi digit number and store it in a variable
		int a = 923; 

		// Extract last digit of the number and store it in a new variable
		int b = a%10;
		
		// Print the last digit
		System.out.println(b);

		// Print the "Last Digit is _"
		System.out.println("Last Digit is " + b);

		// Print the " Last Digit of a is b"
		System.out.println("Last Digit of " + a + " is " + b);
	}
}
