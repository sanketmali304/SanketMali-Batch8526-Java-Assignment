class RstrCharAt
{
public static void main(String []args)
	{
	String str="Hii am developer";
	String s="";

	for(int i=0;i<str.length();i++)
	{
	char p=str.charAt(i);
	s=p+s;	
	}
	System.out.print("Reverse string:"+s);
	}

}