/*Create java application for the following
Accept 2 numbers from user & operation to perform
1. Add 2.Subtract 3. Multiply 4.Divide 5.Exit
Display the result of the operation. 
Java app must continue to run till user chooses exit option*/
import java.util.*;
public class ArithmeticMenuDriven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice,n,a,b,sum=0,mul=0,sub=0;
		float div=0;
		do{
			System.out.println("1.Addition");
			System.out.println("2.subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			
			System.out.println();
			
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			
		switch(choice)
		{
			case 1:
			System.out.println("Enter Two number:to Find Sum:");
			a=sc.nextInt();
			b=sc.nextInt();
			sum=a+b;
			System.out.println("Sum="+sum);
			break;
			
			case 2:
			System.out.println("Enter Two number:to Find Subtraction:");
			a=sc.nextInt();
			b=sc.nextInt();
			sub=a-b;
			System.out.println("Subtraction="+sub);
			break;
			
			case 3:
			System.out.println("Enter Two number:to find Multiplication:");
			a=sc.nextInt();
			b=sc.nextInt();
			mul=a*b;
			System.out.println("Multiplication="+mul);
			break;
			
			case 4:
			System.out.println("Enter Two number:to find Division:");
			a=sc.nextInt();
			b=sc.nextInt();
			if(b!=0)
			{
			div=a/(float)b;
			System.out.println("Division="+div);
			}
			else
			{
				System.out.println("Denominator must not be Zero!pls Enter Another value:");
			}
			break;
			
			default:
			System.out.println("Select Valid Option:");
		}
		//System.out.println("Again to 1 else  0");
		//n=sc.nextInt();
		}while(choice!=5);	
	}
}	