package in.ineuron;
public class First {
		static void nextgreaterelement(int arr[], int n)
		{
			int next, i, j;
			for (i = 0; i < n; i++) {
				next = -1;
				for (j = i + 1; j < n; j++) {
					if (arr[i] < arr[j]) {
						next = arr[j];
						break;
					}
				}
				System.out.print(next+" ");
			}
		}
		public static void main(String args[])
		{
			int arr[] = { 6 ,8, 0, 1, 3 };
			int N=4;
			int n = arr.length;
			nextgreaterelement(arr, n);
		}
	}
