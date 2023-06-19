package in.ineuron;

import java.util.Stack;

public class Fourth {

	static Stack<Character>st=new Stack<>();
	static void insert(char x) {
		if(st.isEmpty())
			st.push(x);
		else {
			Character a = st.peek();
			st.pop();
			insert(x);
			st.push(a);
		}
		
	}
	static void reverse() {
		if(st.size()>0) {
			Character x = st.peek();
			st.pop();
			reverse();
			insert(x);
		}
		
	}
	
	public static void main(String[] args) {
		st.push('3');
		st.push('2');
		st.push('1');
		st.push('7');
		st.push('6');
		System.out.println("Before Reverse :: "+st);
		reverse();
		System.out.println("After Reverse :: "+st);
	}

}
