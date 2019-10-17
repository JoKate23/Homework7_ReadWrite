	//two functions
	//each function has a variable - valueToWrite/valueToRead
	//state - switches wen/ren
	//wen = 1 ren = 0 to write
	//ren = 1 to read, wen can be anything -- ren overrules wen
public class Memory 
{
	
	private boolean wen;
	private boolean ren;
	private int numCells;
	private int bitWidth;
	private int writeVal;
	private int readVal;
	private String[] memAddress;
	
	
	public static void writeTo()
	{
		this.wen = wen;
		this.ren = ren;
		this.writeVal = writeVal;
		this.memAddress = memAddress;
		
		//wen evaluation
		//only evaluate wen if ren = 0
		while(ren == 0)
		{
			if (wen == 0)
			{
				break;
			}
			else if (wen == 1)
			{
				//write out
				System.out.println("Write = " + writeVal);
				//write to memory??
		
			}
			else
			{
				System.out.println("Invalid wen")
			}

		}
		break;
			
			
		
	}
	
	public static void readTo()
	{
		this.ren = ren;
		this.readVal = readVal;
		this.memAddress = memAddress;
		
		String[] memAddress = 
		
		//ren evaluation
		if(ren == 0)
		{
			break;
		}
		else if(ren == 1)
		{
			//read out
			System.out.println("Read = " + readVal);
			//read from memory??
			readValue = memAddress.getAddress();
		}
		else
		{
			System.out.println("Invalid ren");
		}
		
	
	}
	
	public void setState()
	{

		String renVal;
		String wenVal;
		
		//set value of ren
		renVal = 1;
		while(true)
		{
			readTo();
		}
		break;
		
		while(false)
		{
			writeTo();
		}
		break;


		//set value of wen
		
		//run wen function
		

	}


	
	
	
}
