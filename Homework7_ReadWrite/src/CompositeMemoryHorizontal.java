
public class CompositeMemoryHorizontal 
{
	private Memory theMemory;
	private int wData;
	private int memAddress1;
	private int memAddress2;
	
	public static void setState()
	{
		this.theMemory = theMemory;
		String renVal;
		String wenVal;
		
		// 0 = less than 1G
		// 1 = more than 1G
		if(wData == 0)
		{
			theMemory.setState(memAddress1);
		}
		else if(wData = 1)
		{
			theMemory.setState(memAddress2);
		}
		else if(rData.contentEquals(""))
		{
			theMemory.setState(memAddress1);
		}
		else if(rData = 1)
		{
			theMemory.setState(memAddress2);
		}
		else
		{
			System.out.println("Error - we got probs in the horz");
		}

	}

}
