package in.ineuron;

import java.util.Arrays;

public class Seventh {
	    public static int[][] generateMatrix(int n) {
	        int[][] result = new int[n][n];
	        int cnt = 1;
	        for (int layer = 0; layer < (n + 1) / 2; layer++) {
	            for (int ptr = layer; ptr < n - layer; ptr++) {
	                result[layer][ptr] = cnt++;
	            }
	            for (int ptr = layer + 1; ptr < n - layer; ptr++) {
	                result[ptr][n - layer - 1] = cnt++;
	            }
	            for (int ptr = layer + 1; ptr < n - layer; ptr++) {
	                result[n - layer - 1][n - ptr - 1] = cnt++;
	            }
	            for (int ptr = layer + 1; ptr < n - layer - 1; ptr++) {
	                result[n - ptr - 1][layer] = cnt++;
	            }
	        }
	        return result;
	    
	}
	public static void main(String[] args) {
		int n=3;
		Seventh seventh = new Seventh();
		int[][] generateMatrix = seventh.generateMatrix(n);
		System.out.println(Arrays.deepToString(generateMatrix));
	}

}
