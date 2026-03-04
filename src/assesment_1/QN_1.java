package assesment_1;

import java.util.Scanner;

public class QN_1 {

	static int uniDigit(int num)
	{
	    int sum = 0;

	    while (num > 9)
	    {
	        sum = 0;
	        while (num != 0)
	        {
	            sum += num % 10;
	            num /= 10;
	        }
	        num = sum;
	    }

	    return num;  
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of players : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		int val;
		
		System.out.println("Please enter the value between 1000 and 9000");
		for (int i=0 ; i<n ; i++ )
		{
			val= sc.nextInt();
			if ( val >= 1000
					&& val <= 9999)
			{
				arr[i] = val;
			}
			
			else
			{
				System.out.println("Please enter the value between 1000 and 9000");
				
				arr[i] = sc.nextInt();
			}
			
		}
		
		for (int i=0 ; i<n ; i++)
		{
			if ( uniDigit(arr[i]) == 7)
			{
				System.out.println("First Prize is to token: "+arr[i]);
			}
			
			else if ( uniDigit(arr[i]) == 5 )
			{
				System.out.println("Second Prize is to token: "+arr[i]);
			}
			else if ( uniDigit(arr[i]) == 3)
			{
				System.out.println("Third Prize is to token: "+arr[i]);
			}
			
			
		}

	}

}
