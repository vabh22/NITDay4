import java.util.*;
class SwitchDemo2{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		//System.out.println("1.Sunday\n2.Monday\n3.Tuesday\n4.Wednesday\n5.Thrusday\n6.Friday\n7.Saturday");
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		switch(choice){
			case 1: 
					System.out.println("Sunday");
					break;
			case 2: 
					System.out.println("Monday");
					break;
			case 3:
					System.out.println("Tuesday");
					break;
			case 4:
					System.out.println("Wednesday");
					break;
			case 5:
					System.out.println("Thrusday");
					break;
			case 6:
					System.out.println("Friday");
					break;
			case 7:
					System.out.println("Saturday");
					break;
			default :
					System.out.println("Invalid choice");
		}
	}
}
					
	