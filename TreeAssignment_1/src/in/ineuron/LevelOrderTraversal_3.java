package in.ineuron;

import java.util.*;

public class LevelOrderTraversal_3 {
	
	static class Node
	{
		int data;
		int min, max;
	}
	static boolean levelOrderIsOfBST(int arr[], int n)
	{
		if (n == 0)
			return true;
		Queue<Node> q = new LinkedList<Node>();
		int i = 0;
		Node newNode=new Node();
		newNode.data = arr[i++];
		newNode.min = Integer.MIN_VALUE;
		newNode.max = Integer.MAX_VALUE;
		q.add(newNode);
		while (i != n && q.size() > 0)	
		{
			Node temp = q.peek();
			q.remove();
			newNode = new Node();
			if (i < n && (arr[i] < (int)temp.data &&
						arr[i] > (int)temp.min))
			{
				newNode.data = arr[i++];
				newNode.min = temp.min;
				newNode.max = temp.data;
				q.add(newNode);			
			}
			
			newNode=new Node();
			if (i < n && (arr[i] > (int)temp.data &&
						arr[i] < (int)temp.max))
			{
				newNode.data = arr[i++];
				newNode.min = temp.data;
				newNode.max = temp.max;
				q.add(newNode);		
			}	
		}
		if (i == n)
			return true;
		return false;	
	}
	public static void main(String args[])
	{
		int arr[] = {11, 6, 13, 5, 12, 10};
		int n = arr.length;
		if (levelOrderIsOfBST(arr, n))
			System.out.print( "Yes");
		else
			System.out.print( "No");	
		
	}
	}
