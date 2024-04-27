/*2 Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(10) , display total bill & exit.
*/
import java.util.*;
public class GenerateBill
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		int Ds=30,s=15,i=30,sw=20,sk=30,wp=20,bg=50,p=20,um=20;
		int qt;
		int finalPrice=0;
		do
		{
			System.out.println("Items:    Price:");
			System.out.println("1.select Dosa:30");
			System.out.println("2.select Samosa:15");
			System.out.println("3.select Idli:20");
			System.out.println("4.select Sandwich:20");
			System.out.println("5.select Dokla:30");
			System.out.println("6.select wadapaw:20");
			System.out.println("7.select Burger:50");
			System.out.println("8.select Poha:20");
			System.out.println("9.select Upma:20");
			System.out.println("10.Generate Bill");
			System.out.println("11.Exit");
			
			System.out.println();
			
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			System.out.println();
			
		switch(choice)
		{
			case 1:
			System.out.println("Enter Quantity:");
			qt=sc.nextInt();
			finalPrice=qt*Ds;
			System.out.println("price:"+finalPrice);
			break;
			
			case 2:
			System.out.println("Enter Quantity:");
			qt=sc.nextInt();
			finalPrice=qt*s;
			System.out.println("price:"+finalPrice);
			break;
			
			case 3:
			System.out.println("Enter Quantity:");
			qt=sc.nextInt();
			finalPrice=qt*i;
			System.out.println("price:"+finalPrice);
			break;
			
			case 4:
			System.out.println("Enter Quantity:");
			qt=sc.nextInt();
			finalPrice=qt*sw;
			System.out.println("price:"+finalPrice);
			break;
			
			case 5:
			System.out.println("Enter Quantity:");
			qt=sc.nextInt();
			finalPrice=qt*sk;
			System.out.println("price:"+finalPrice);
			break;
			case 6:
			System.out.println("Enter Quantity:");
			qt=sc.nextInt();
			finalPrice=qt*wp;
			System.out.println("price:"+finalPrice);
			break;
			case 7:
			System.out.println("Enter Quantity:");
			qt=sc.nextInt();
			finalPrice=qt*bg;
			System.out.println("price:"+finalPrice);
			break;
			case 8:
			System.out.println("Enter Quantity:");
			qt=sc.nextInt();
			finalPrice=qt*p;
			System.out.println("price:"+finalPrice);
			break;
			case 9:
			System.out.println("Enter Quantity:");
			qt=sc.nextInt();
			finalPrice=qt*um;
			System.out.println("price:"+finalPrice);
			break;
			case 10:
			break;
			
			default:
			System.out.println("pls! Enter Valid Option:");
		}
		}while(choice!=11);
		
	}
}
			
			
			