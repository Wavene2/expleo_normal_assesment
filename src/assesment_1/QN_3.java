package assesment_1;

import java.util.Scanner;

public class QN_3 {
	
	static boolean perfectNumber(int n)
	{
		int sum = 0;
		int num = n;
		while (n > 0)
		{
			sum += n % 10;
			
			n = n/10;
			
			
			
		}
		
		if (sum % num == 0) 
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		if (perfectNumber(n))
		{
			System.out.println("The given number is perfect number ");
		}
		
		else
		{
			System.out.println("The given number is not a perfect number ");
		}

	}

}
