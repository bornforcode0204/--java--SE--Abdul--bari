import java.lang.*;
import java.util.*;

class KeybRead1
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	String name;
	
	System.out.println("May I know your name : ");
	
	name = s.nextLine();
	
	
	System.out.println("Welcome Mr./Miss " + name);
}
}