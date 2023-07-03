package in.ineuron;

public class Third {
	    public static int countStudents(int[] students, int[] sandwiches) {
	        int ones = 0;
	        int zeros = 0;
			
	        for(int stud : students){
	            if(stud == 0) 
	            	zeros++;
	            else ones++;
	        }
	        for(int sandwich : sandwiches){
	            if(sandwich == 0){  
	                if(zeros == 0){ 
	                    return ones;
	                }
	                zeros--;
	            }
	            else{
	                if(ones == 0){ 
	                    return zeros;
	                }
	                ones--;
	            }
	        }
	        return 0;
	    }
	    public static void main(String args[]) {
	    	int []students = {1,1,1,0,0,1};
	    	int []sandwiches = {1,0,0,0,1,1};
	    	System.out.println(countStudents(students,sandwiches));
	    	
	    }
	}


