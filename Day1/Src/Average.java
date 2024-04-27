//Accept two Double value and print its average through Scanner class
import java.util.*;
public class Average
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double a1,a2,sum=0,average;
System.out.println("Enter Two number Double type:");
a1=sc.nextDouble();
a2=sc.nextDouble();

sum=a1+a2;
System.out.println("Sum="+sum);

average=sum/2;
System.out.println("Average="+average);
sc.close();
}
}
