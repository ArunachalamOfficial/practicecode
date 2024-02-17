
public class Sentrev {
	public static void main(String args[])
	{
		String sen="i like you";
		String rev="";
		String []let=sen.split(" ");
		for(int i=let.length-1;i>=0;i--)
		{
			rev=rev+let[i]+" ";
		}
		System.out.println(rev);
		
	}

}
