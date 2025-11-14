package homeassignment;


public class Fibanocci {

	public static void main(String[] args)
	{
	
		int n=8;
		
		int first=0, second=1;
		//System.out.println("Fibanoci Series :" +first+ " ," +second);

		for(int i=1; i<=n; i++)
		{
			System.out.print(first + ", ");
			int next= first +second;
			first=second;
			second=next;
			
			
		}
	}

}
