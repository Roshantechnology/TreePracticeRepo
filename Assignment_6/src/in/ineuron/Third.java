package in.ineuron;

public class Third {
	    public static boolean validMountainArray(int[] arr) {
	        int N = arr.length;
	        int i = 0;
	        while (i+1 < N && arr[i] < arr[i+1])
	            i++;
	        if (i == 0 || i == N-1)
	            return false;
	        while (i+1 < N && arr[i] > arr[i+1])
	            i++;

	        return i == N-1;
	    }
	
	public static void main(String[] args) {
		int arr[]= {2,1};
		System.out.println(validMountainArray(arr));
	}

}
