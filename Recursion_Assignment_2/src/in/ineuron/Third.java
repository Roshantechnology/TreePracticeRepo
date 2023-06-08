package in.ineuron;

public class Third {
		static void powerSet(String set, int index, String curr)
		{
			int n = set.length();
			if (index == n) {
				return;
			}
			System.out.print(curr+" ");
			for (int i = index + 1; i < n; i++) {
				curr += set.charAt(i);
				powerSet(set, i, curr);
				curr = curr.substring(0, curr.length() - 1);
			}
		}
		public static void main(String[] args)
		{
			String set = "abcd";
			int index = -1;
			String curr = "";
			powerSet(set, index, curr);
		}
	}
