	
import java.util.Scanner;

class cn
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int reverse=0;
		while (n != 0)
		   {
		      reverse = reverse * 10;
		      reverse = reverse + n%10;
		      n       = n/10;
				}
		System.out.println(""+reverse);
	}
}
		
		
