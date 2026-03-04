package assesment_1;

import java.util.Scanner;

public class QN_5 {

	static boolean rule_4(int num )
	{
		if (num % 9 ==0 )
		{
			return true;
		}
		return false;
	}
	
	static boolean rule_3(int num)
	{
		if (num % 10 == 3)
		{
			return true;
		}
		
		return false;
	}
	
	static boolean rule_2(int num)
	{
		if (num % 8 == 0)
		{
			return true;
		}
		
		return false ;
	}
	
	static boolean rule_1(int num)
	{
		if (num % 2 !=0) 
		{
			return true;
		}
		return false;
	}
	
	static boolean rule_0(int num)
	{
		if (num % 2 == 0)
		{
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [10];
		
		int j=0;
		while (true)
		{
			int val = sc.nextInt();
			
			if (val < 0) {
				break;
			}
			
			arr[j++] = val;
		}
		System.out.println("Scores before processing:");
		for (int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for (int i=0 ; i<arr.length ; i++)
		{
			
			if (rule_4(arr[i]))
			{
				arr[i] = 4;
			}
			
			else if (rule_3(arr[i]))
			{
				arr[i] = 3;
			}
			
			else if (rule_2(arr[i]))
			{
				arr[i] = 2;
			}
			
			else if (rule_1(arr[i]))
			{
				arr[i] = 1;
			}
			
			else if (rule_0(arr[i]))
			{
				arr[i] = 0;
			}
		}
		System.out.println();
		System.out.println("Scores after processing: ");
		for (int i=0 ; i<arr.length ; i++) 
		{
			System.out.print(arr[i]+" ");
			
		}
	}

}
