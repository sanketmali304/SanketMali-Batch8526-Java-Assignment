class Inherit
{
static int n=1;
String s="Inherit Class";
void msg()
	{
	System.out.println(n+" "+s);
	n++;
	}
}
public class Test extends Inherit
{
public static void main(String [] agrs)
	{
	Inherit obj[]=new Test[20];

	for(int i=0;i<20;i++)
	{
	obj[i]=new Test();
	obj[i].msg();
	}
	}
}