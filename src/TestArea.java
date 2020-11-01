import java.util.*;

public class TestArea {
	
	static Scanner input = new Scanner(System.in);
	static ExpandableArray array = new ExpandableArray();
	
	public static void main(String[] args)
	{
		System.out.println("Hi, this program will expand an array to whatever value you prefer.");
		
		while (true)
		{
			System.out.println("Enter a negative at this point to move on");
			System.out.println("\nPlease enter an array point: ");
			int point = input.nextInt();
			if (point < 0)
			{
				break;
			}
			System.out.println("Please enter a number value: ");
			Object value = input.nextDouble();
			
			array.set(point, value);
		}
		
		if (array.getSize() == 0) return;
		
		System.out.println("Array successfully created");
		while (true)
		{
			System.out.println("Enter a negative at this point to leave the program.");
			System.out.println("\nWhat value would you like to check: ");
			int point = input.nextInt();
			if (point < 0)
			{
				break;
			}
			System.out.println("The value at " + point + " is: " + array.get(point) );
		}
		
	}
	
}
