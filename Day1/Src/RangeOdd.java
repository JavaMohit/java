import java.util.*;
class RangeOdd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int begin,end;
System.out.println("Enter Range(begning to end):");
begin=sc.nextInt();
end=sc.nextInt();

System.out.println("Odd number is:");

for(int i=begin; i<=end; i++)
{
if(i%2!=0)
{
System.out.print(i+",");
}
}
}
}

