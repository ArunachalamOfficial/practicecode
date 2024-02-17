
public class Salary {
	public void single()
	{
		int a=20,b=30;
		int temp=a;
		a=b;
		b=temp;
		System.out.print(a+""+ b);
	}
     public void math()
     {
    	 int a=20,b=30;
    	  a=a-b;
    	  b=a+b;
    	  a=b-a;
    	  System.out.print(a+""+b);
     }
     public static void main(String args[])
     {
    	 Salary sc=new Salary();
    	 sc.math();
     }
}
