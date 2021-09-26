package homeWork2;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> current;

	public LinkedList() {
		head = current = null;
	}

	public boolean empty() {
		return head == null;
	}

	public boolean last() {
		return current.next == null;
	}

	public boolean full() {
		return false;
	}

	public void findFirst() {
		current = head;
	}

	public void findNext() {
		current = current.next;
	}

	public T retrieve() {
		return current.data;
	}

	public void update(T val) {
		current.data = val;
	}

	public void insert(T val) {
		Node<T> tmp;
		if (empty()) {
			current = head = new Node<T>(val);
		} else {
			tmp = current.next;
			current.next = new Node<T>(val);
			current = current.next;
			current.next = tmp;
		}
	}

	public void remove() {
		if (current == head) {
			head = head.next;
		} else {
			Node<T> tmp = head;
			while (tmp.next != current)
				tmp = tmp.next;
			tmp.next = current.next;
		}
		if (current.next == null)
			current = head;
		else
			current = current.next;
	}

	// problem2.1
	public void removeK(int k) {
		for (int i = 0; i < k; i++)
				current.next = current.next.next;
	}

	// problem2.2

	public void insertBeforeCurrent(T e) {
		Node<T> newNode = new Node<T>(e);
		if (current == head) {
			newNode.next = head;
			head = newNode;

		} 
		else {
			Node<T> previous = head;

			while (previous.next != current)
				previous = previous.next;

			newNode.next = current;
			previous.next = newNode;
		}
		current = newNode;

	}
}