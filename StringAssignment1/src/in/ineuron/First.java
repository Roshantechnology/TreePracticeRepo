package in.ineuron;

import java.util.Arrays;

public class First {
		static int size = 256;
		static String areIsomorphic(String s, String t)
		{
			int m = s.length();
			int n = t.length();

			if (m != n)
				return "False";
			Boolean[] marked = new Boolean[size];
			Arrays.fill(marked, Boolean.FALSE);
			int[] map = new int[size];
			Arrays.fill(map, -1);
			for (int i = 0; i < n; i++) {
				if (map[s.charAt(i)] == -1) {
					if (marked[t.charAt(i)] == true)
						return "False";
					marked[t.charAt(i)] = true;
					map[s.charAt(i)] = t.charAt(i);
				}
				else if (map[s.charAt(i)] != t.charAt(i))
					return "False";
			}

			return "True";
		}
		public static void main(String[] args)
		{
			String s="egg";
			String t="add";
			
			String res = areIsomorphic(s,t);
			System.out.println(res);
		}
	}



