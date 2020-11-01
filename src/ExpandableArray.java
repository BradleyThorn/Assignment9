
public class ExpandableArray {

	private Object[] array;
	
	public ExpandableArray()
	{
		array = new Object[0];
	}
	
	//I think this is a good example of abstraction. Seeing as the user only cares that they put in a new value,
	//and they get their same array given back with a new higher count, it should look just like that. Unfortunately, that
	//isn't really possible. So instead, what we're really doing is making a whole new array and putting the same values in again,
	//plus expanding the array to the new specified length. It's kinda like cheating, but it's good :)
	
	public void set(int index, Object value)
	{
		if (index >= array.length)
		{
			Object[] expandedArray = new Object[index];
			
			for (int x = 0; x < array.length; x++)
			{
				expandedArray[x] = array[x];
			}
			
			array = expandedArray;
			array[index - 1] = value;
		}
		else
		{
			array[index - 1] = value;
		}
		
	}
	
	public Object get(int index)
	{
		if (array.length < index)
		{
			return null;
		}
		else if (array[index - 1] == null)
		{
			System.out.println("There's nothing there, sorry");
		}
		
		return array[index - 1];
	}
	
	public int getSize()
	{
		return array.length;
	}
}
