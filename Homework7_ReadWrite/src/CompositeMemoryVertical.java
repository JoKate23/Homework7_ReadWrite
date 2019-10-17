
//same as memory?
	//reads first bit to determine which memory to send to

public class CompositeMemoryVertical 
{
	private Memory theMemory;
	private int memAddressA;
	private int memAddressB;
	private int wData;
	
	public static void setState()
	{

		String renVal;
		String wenVal;
		
		// 0 = less than 1G
		// 1 = more than 1G
		if(wData.contentEquals(""))
		{
			theMemory.setState(memAddressA);
		}
		else if(wData = 1)
		{
			theMemory.setState(memAddressB);
		}
		else if(rData.contentEquals(""))
		{
			theMemory.setState(memAddressA);
		}
		else if(rData = 1)
		{
			theMemory.setState(memAddressB);
		}
		else
		{
			System.out.println("Error - we got probs in the verts");
		}

	}
}
