import java.util.*;
//using length and charAt()
class DemoString4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strings--------");
		String s=sc.nextLine();
		int len=s.length();//it will count length of String
		int count=0;
		int i;
		for( i=0;i<len;i++){
			char ch=s.charAt(i);
			switch(ch){
				case 'a':
				case 'A':count++;
				break;
				case 'e':
				case 'E':count++;
				break;
				case'i':
				case'I':count++;
				break;
				case'o':
				case'O':count++;
				break;
				case'u':
				case'U':count++;
			}
		}
			System.out.println("Count vowel is"+count);
		
	}
}
			