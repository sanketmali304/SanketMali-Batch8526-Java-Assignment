class BreakWhile
{
public static void main(String []args)
	{
	int n=1;
	while(n<=10)
	{
	  if(n==5)
	  { 
	    System.out.println(n++);
	    break;
	  }
	  System.out.println(n++);
	}
	}
}