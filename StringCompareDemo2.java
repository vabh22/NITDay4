import java.util.*;
class StringCompareDemo2{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1=s.nextLine().trim(); //trim method remove the space before and after string
		System.out.println("Enter the Second String");
		String str2=s.nextLine().trim();
		System.out.println("===equals=====");
		boolean k=str1.equalsIgnoreCase(str2);
		if(k){
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("=====compareTo====");
		int a=str1.compareToIgnoreCase(str2);
		if(a==0){
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("String are not equal");
		}
		s.close();
	}
}