package assesment_1;

public class QN_2 {
	
	static int max( int a , int b , int c)
	{
		int max = 0;
		int temp = 0;
		while (a > 0)
		{
			temp = a % 10;
			
			if (temp > max ) {
				max = temp;
			}
			
			a=a/10;
		}
		
		while (b > 0)
		{
			temp = b % 10;
			
			if (temp > max ) {
				max = temp;
			}
			
			b=b/10;
		}
		
		while (c > 0)
		{
			temp = c % 10;
			
			if (temp > max ) {
				max = temp;
			}
			
			c=c/10;
		}
		
		return max;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n1 = 123;
		int n2 = 582;
		int n3 = 175;
		
		int max = max(n1,n2,n3);
		
		;
		String res = max+"";
		
		int r1 = n1 % 10;
		int r2 = n2 % 10;
		int r3 = n3 % 10;
		
		res += Math.min(r1, Math.min(r2, r3));
		
		n1 = n1 /10;
		n2 = n2 /10;
		n2 = n2 /10;
		
		r1 = n1 % 10;
		r2 = n2 % 10;
		r3 = n3 % 10;
		
		res += Math.min(r1, Math.min(r2, r3));
		
		n1 = n1 /10;
		n2 = n2 /10;
		n2 = n2 /10;
		
		r1 = n1 % 10;
		r2 = n2 % 10;
		r3 = n3 % 10;
		
		res += Math.min(r1, Math.min(r2, r3));
		
		res += Math.max(r1, Math.max(r2, r3));
		
		System.out.println(res);
		
		
	}

}
