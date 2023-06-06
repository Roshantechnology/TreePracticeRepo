package in.ineuron;

import java.util.Stack;

public class Seventh {
	    public boolean backspaceCompare(String S, String T) {
	        return build(S).equals(build(T));
	    }

	    public String build(String S) {
	        Stack<Character> ans = new Stack();
	        for (char c: S.toCharArray()) {
	            if (c != '#')
	                ans.push(c);
	            else if (!ans.empty())
	                ans.pop();
	        }
	        return String.valueOf(ans);
	    }
	
	public static void main(String[] args) {
		String S = "ab#c";
		String T = "ad#c";
		System.out.println(new Seventh().backspaceCompare(S, T));
	}

}
