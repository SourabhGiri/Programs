class P 
{
	public static void main(String[] args) 
	{
		//Take two number and store it in different variable 
		int a = 10;
		int b = 23;

		// Extract last digit of both the number and store in two different variable
		int c = a%10;
		int d = b%10;

		//Add last digit of both the number and store the result in new variable
		int e = c+d;

		// Print the result as " Sum of Last digit of a and b is sum"
		System.out.println("Sum of last digit of "+a+" and "+b+" is "+ e);
	}
}
