package in.ineuron;

public class Fourth{
	
	public static int CountString(String str) {
		if(str.equals(""))
		return 0;
		else
			return CountString(str.substring(1))+1;
		
	}
	
	public static void main(String[] args)
	{

		
		String str ="abcd";
		System.out.println(CountString(str));
		
	}
}
