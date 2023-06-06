package in.ineuron;

public class Third {
		public String addStrings(String num1, String num2) {

		    int carry =0;
		    StringBuilder sb = new StringBuilder();
		    int i = num1.length() - 1;
		    int j = num2.length() - 1;
		    
		    while(i>=0 || j>=0)
		    {
		        int a = i>=0 ? num1.charAt(i) - '0' : 0;
		        int b = j>=0 ? num2.charAt(j)- '0' : 0;
		        
		        int sum = carry+a+b;
		        carry = sum / 10;
		        sb.append(sum%10);
		        i--; 
		        j--; 
		        
		    }
		    
		    if(carry !=0)
		        sb.append(carry);
		    
		    return sb.reverse().toString();
		}
		
	public static void main(String[] args) {
		

		String num1="11";
		String num2="123";
		Third third = new Third();
		String addStrings = third.addStrings(num1, num2);
		System.out.println(addStrings);
	}

}
