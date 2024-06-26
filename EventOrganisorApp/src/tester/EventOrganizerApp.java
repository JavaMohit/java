package tester;
import com.cdac.events.*;
import java.util.Scanner;


public class EventOrganizerApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter max no of participants");//100
		Person[] participants=new Person[sc.nextInt()];//objs : 1 : array
		int counter=0;
		boolean exit=false;
		while(!exit)
		{
			System.out.println("Options : 1. Register Student \n"
					+ "2. Register Faculty \n"
					+ "3. Display All details\n"
					+ "4. Display specific details\n"
					+ "0 : Exit");
			System.out.println("Choose an option");
			switch (sc.nextInt()) {
			case 1://student reg
				if(counter<participants.length)
				{
					System.out.println("Enter student details :  fn, ln, "
							+ "gradYear, name fees marks");
					participants[counter]=new Student(sc.next(), sc.next(), sc.nextInt(), 
							sc.next(), sc.nextDouble(), sc.nextInt());
					counter++;
					System.out.println("student registered!");
				} else 
					System.out.println("Event Full!!!!!");
				
				break;
			case 2://faculty reg
				if(counter<participants.length)
				{
					System.out.println("Enter faculty details :  fn, ln, "
							+ "yrs sme");
					participants[counter]=new Faculty(sc.next(), sc.next(),
							sc.nextInt(),sc.next());
					counter++;
					System.out.println("faculty registered!");
				} else 
					System.out.println("Event Full!!!!!");
				
				break;
			case 3 : 
				System.out.println("All participant details");
				for(Person p : participants)
					if(p != null)
						System.out.println(p);
				break;
				
			case 4 : 
				System.out.println("Enter seat no ");
				int index=sc.nextInt()-1;
				if(index >= 0 && index < counter)
				{
					System.out.println(participants[index]);
				}
				else
					System.out.println("Invalid seat no !!!!!");
				break;

			case 0:exit=true;
			System.out.println("bye");
				
			}
		}
		sc.close();

	}

}
