class StringDmo3Reverse{
	public static void main(String args[])
		{
			String s1="Sindhu";
			String s2=" kumari";
			String s3=s1.concat(s2);
			System.out.println("After Adding "+s3);
			StringBuffer sb=new StringBuffer(s3);
			sb.reverse();
			System.out.println("Reverse of String :");
			System.out.println(sb);
		}
	}