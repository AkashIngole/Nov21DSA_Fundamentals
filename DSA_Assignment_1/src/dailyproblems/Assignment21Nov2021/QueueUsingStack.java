package dailyproblems.Assignment21Nov2021;

import java.util.*;

class Queue {
	Stack<Integer> s1;
	Stack<Integer> s2;
	
	public Queue() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	public void insert(Integer element) {
		while(!s1.isEmpty()) {
			s2.add(s1.pop());
		}
		
		s1.push(element);
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	public Integer remove() {
		if(s1.isEmpty()) {
			throw new EmptyStackException();
		}
		
		return s1.pop();
	}

	
	
	
}
public class QueueUsingStack {

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		for(int i = 1; i <= 10; i++) {
			queue.insert(i);
		}
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());

	}

}
