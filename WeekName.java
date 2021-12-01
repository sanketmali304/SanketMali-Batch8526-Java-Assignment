import java.util.Scanner;
class WeekName
{
public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A Number:");
	int no=sc.nextInt();
	String day="";
	switch(no)
	{
	case 1:day="Monday";
		break;
	case 2:day="Tus";
		break;
	case 3:day="Wed";
		break;
	case 4:day="Thur";
		break;
	case 5:day="Fri";
		break;
	case 6:day="Sat";
		break;	
	case 7:day="Sunday";
		break;
	default :day="Invalid Day range";
	}
	System.out.print("Day  :"+day);
	}
}