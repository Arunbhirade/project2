import java.util.Scanner;
class Dynamic5 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value");
        int a=s.nextInt();
        int b=s.nextInt();
       for(int i=b;i>=a;i--)
		{
		   if(i%2==0){
		System.out.println(i);
		   }
	   }
	}
}
