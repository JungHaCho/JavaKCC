package kosa.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack =  new Stack<Integer>();
		LinkedList<Integer>queue = new LinkedList<Integer>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}