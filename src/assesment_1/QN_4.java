package assesment_1;

import java.util.Scanner;

public class QN_4 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		
		int first = sc.nextInt();
		
		System.out.print("Enter the last number : ");
		
		int last = sc.nextInt();
		
		for (int i=first ; i<=last ; i++ ) 
		{
			if ( i%10 == 0 )
			{
				System.out.print("dong ");
			}
			
			else if (i%5 == 0)
			{
				System.out.print("ding ");
			}
			
			else 
			{
				System.out.print(i+" ");
			}
		}

	}

}
