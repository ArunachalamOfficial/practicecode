import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Reverse {
	public void usingbuff()
	{
		Scanner s = new Scanner(System.in);
		String name=s.nextLine();
		StringBuffer rev=new StringBuffer();
		rev.append(name);
		System.out.print(rev.reverse());
	}
		
		public void usinglog() {
		Scanner s= new Scanner(System.in);
		String name=s.nextLine();
		char []name1=name.toCharArray();
		String rever="";
		for(int i=name1.length-1;i>=0;i--)
		{
			rever=rever+name1[i];
		}
		System.out.print(rever);
	}
	public void usingcoll() {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		char []name1=name.toCharArray();
		List<Character> rev=new ArrayList<Character>();
		for(Character name2:name1)
		{
			rev.add(name2);
		}
		Collections.reverse(rev);
		ListIterator rever=rev.listIterator();
		while(rever.hasNext())
			
		{
			System.out.print(rever.next());
		}
		
		}
	public static void main(String args[])
	{
		Reverse stin=new Reverse();
		stin.usingcoll();
	}
		
}

