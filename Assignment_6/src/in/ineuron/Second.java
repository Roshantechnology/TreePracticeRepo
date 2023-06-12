package in.ineuron;

public class Second {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        if(matrix.length == 0) return false;

	        int rows = matrix.length;
	        int columns = matrix[0].length;

	        int low = 0;
	        int high = rows * columns;

	        while(low < high) {
	            int mid = (low+high)/2;
	            if(matrix[mid/columns][mid%columns] == target) {
	                return true;
	            } else if (matrix[mid/columns][mid%columns] < target) {
	                low = mid+1;
	            } else {
	                high = mid;
	            }
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;
		Second second = new Second();
		boolean searchMatrix = second.searchMatrix(matrix, target);
		System.out.println(searchMatrix);

	}

}
