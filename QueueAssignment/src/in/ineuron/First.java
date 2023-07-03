package in.ineuron;

public class First {

	public static int FirstNonRepeatingChar(String s) {
		int ans = Integer.MAX_VALUE;
		for(char c='a'; c<='z';c++) {
			int index = s.indexOf(c);
			if(index!=-1&&index==s.lastIndexOf(c)) {
				 ans = Math.min(ans, index);
			}
		}
		return ans==Integer.MAX_VALUE?-1:ans;
	}
	public static void main(String[] args) {
		String s = "aabb";
		System.out.println(FirstNonRepeatingChar(s));
	}

}
