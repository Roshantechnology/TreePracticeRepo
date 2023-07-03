package in.ineuron;

import java.util.LinkedList;

public class Seventh {
    LinkedList<Integer> list;
    
    public Seventh() {
        list = new LinkedList<Integer>();
    }
    
    public void pushFront(int val) {
        list.add(0, val);
    }
    
    public void pushMiddle(int val) {
        list.add(list.size() / 2, val);
    }
    
    public void pushBack(int val) {
        list.add(val);
    }
    
    public int popFront() {
        if(isEmpty()) return -1;
       
        return list.remove(0);
    }
    
    public int popMiddle() {
        if(isEmpty()) return -1;
        
        return list.remove(findMiddleIndex());
    }
    
    public int popBack() {
        if(isEmpty()) return -1;
        
        return list.remove(list.size() - 1);
    }
    
    private boolean isEmpty(){
        return list.isEmpty();
    }
    
    private int findMiddleIndex(){
        return (list.size() - 1) / 2;
    }
    
	public static void main(String[] args) {
		Seventh q = new Seventh();
		q.pushFront(1);  
		q.pushBack(2);   
		q.pushMiddle(3);  
		q.pushMiddle(4);  
		System.out.print(q.popFront()+" ");    
		System.out.print(q.popMiddle()+" ");   
		System.out.print(q.popMiddle()+" ");    
		System.out.print(q.popBack()+" ");      
		System.out.print(q.popFront()+" "); 

	}

}
