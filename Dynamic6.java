import java.util.Scanner;
class Dynamic6 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value");
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i>=b;i--)
		{
		if(i%2==1)
		 {
		    System.out.println(i);
		   }
		}
	}
}
