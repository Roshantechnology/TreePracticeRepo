package in.ineuron;

public class Sixth {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        if (s.length() == 0)
            return true;

        search:
            for (int r = 0; r < s.length(); ++r) {
                for (int i = 0; i < s.length(); ++i) {
                    if (s.charAt((r+i) % s.length()) != goal.charAt(i))
                        continue search;
                }
                return true;
            }
        return false;
    }
	public static void main(String[] args) {
		String s = "abcde";
		String goal = "cdeab";
		System.out.println(new Sixth().rotateString(s, goal));

	}

}
