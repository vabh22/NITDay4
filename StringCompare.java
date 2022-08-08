class StringCompare{
public static void main(String args[])
	{
		String s1="java";
		String s2="java";
		//String s=new String("java");
		String s4="javac";
		//all about equals() comparesion process it compare string but give result in boolean
		System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(s));
		System.out.println(s1.equals(s4));
		//all about compareTo it also compare string but give result in from of integer 
		System.out.println(s1.compareTo(s2));//output give o because s1 string length and s2 string length is equal
		//System.out.println(s1.compareTo(s));//------------------same ---------------
		System.out.println(s1.compareTo(s4));
	}
}
