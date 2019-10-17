import java.util.Scanner;

public class Mux 
{
	//private String stringArray;
	private String stringArray;

	

	//set up for example 4x1 mux in book 5.2.1
	public static void Mux(String[] args)
	{
		String[] stringArray = new String[4];
		stringArray[0] = "0 0";
		stringArray[1] = "0 1";
		stringArray[2] = "1 0";
		stringArray[3] = "1 1";
		
		boolean t, f;
		t = true;
		f = false;
		
		if(stringArray == "0 0")
		{ 
			System.out.println("i0");
		}
		else if(stringArray == "0 1")
		{
			System.out.println("i1");
		}
		else if(stringArray == "1 0")
		{
			System.out.println("i2");
		}
		else if(stringArray == "1 1")
		{
			System.out.println("i3");
		}
		else
		{
			System.out.println("Not Valid Input");
		}
	}
	
	//public static void printTruthTable(stringArray)
	//{
		//boolean t, f;
		//t = true;
		//f = false;
		
		
		
	
	//private final L left;
	//private final R right;	
	
	//public static void arrayOutPairs[] (key, value)
	//{
		//this.left = left;
		//this.right = right;
		

		
		
		
		
	//}

	
	
	//set up for input from user
	public static void main(String args[])
	{
		this.inputNames = inputNames;
		String[] a;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Input Array");
		a = in.hasNext();
		System.out.println("Array = " + a);
		
		String[] inputValues = "00, 01, 10, 11, 100, 101, 110, 111, 1000, 1001, 1010, 1011, 1100, 1101, 1110, 1111";
		String[] outputValues = "i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15";
		
		if(inputValues[i].equals(in))
		{
			outputValues = outputValues[i];
			System.out.println(inputValues + " | " + outputValues);
		}
		else
		{
			System.out.println("Not Valid Input");
		}
		
		
		
	}
		
		
		
		
		
	
	
	
	

}
