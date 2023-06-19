package in.ineuron;

public class Second{
		static void PrevSmallerNum(int[] arr, int n) {
			System.out.print("-1, ");
			for (int i = 1; i < n; i++) {
				int j;
				for (j = i - 1; j >= 0; j--) {
					if (arr[j] < arr[i]) {
						System.out.print(arr[j] + ", ");
						break;
					}
				}
				if (j == -1)
					System.out.print("-1, ");
			}
		}
		public static void main(String[] args)
		{
			int[] arr = {1, 5, 0, 3, 4, 5 };
			int n = arr.length;
			PrevSmallerNum(arr, n);
		}
	}
