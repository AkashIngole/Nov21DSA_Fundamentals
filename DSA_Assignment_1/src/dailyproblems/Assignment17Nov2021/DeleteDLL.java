package dailyproblems.Assignment17Nov2021;

class Node {
	public int data;
	public Node next;
	public Node prev;

	public Node(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
}

public class DeleteDLL {

	public Node head;

	public DeleteDLL(int data) {
		Node a = new Node(data);
		head = a;
	}

	public void traversal() {
		Node temp = head; 

		while (temp != null) { 
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}

		System.out.println("");
	}

	public void insertAtFront(Node n) {
		n.next = head;
		head.prev = n;
		head = n;
	}


	public void insertAtTail(Node n) {
		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = n;
		n.prev = temp;
	}


	public void insertAfter(Node n, Node a) {
		n.next = a.next;
		a.next.prev = n;
		a.next = n;
		n.prev = a;
	}


	public void del(Node a) {
		if (a.prev != null) { 
			a.prev.next = a.next;
		} else { 
			head = a.next;
		}

		if (a.next != null) {
			a.next.prev = a.prev;
		}
	}

	public static void main(String[] args) {
		DeleteDLL l = new DeleteDLL(10);

		Node a, b, c;
		a = new Node(20);
		b = new Node(50);
		c = new Node(60);

		l.head.next = a;
		a.next = b;
		b.next = c;

		l.traversal();

		Node z;

		z = new Node(0);
		l.insertAtFront(z);
		z = new Node(-10);
		l.insertAtFront(z);

		z = new Node(100);
		l.insertAtTail(z);

		z = new Node(30);
		l.insertAfter(z, a);
		z = new Node(40);
		l.insertAfter(z, a.next);
		z = new Node(500);
		l.insertAfter(z, a.next.next);

		l.traversal();

		l.del(l.head);
		l.del(z);

		l.traversal();

	}

}
