package priorityQueue;

public class LinkedPQ<T>
{
	private int size;
	private PQNode<T> head;

	public LinkedPQ()
	{
		head = null;
		size = 0;
	}

	public int length ()
	{
		return size;
	}
		
	public boolean full ()
	{
		return false;
	}
	
	public void enqueue(T e, int pty)
	{
		PQNode<T> tmp = new PQNode<T>(e, pty);
	
		if((size == 0) || (pty > head.priority)) 
		{
			tmp.next = head;
			head = tmp;
		}
		else
		{
			PQNode<T> p = head;
			PQNode<T> q = null;

			while((p != null) && (pty <= p.priority)) 
			{
				q = p;
				p = p.next;
			}

			tmp.next = p;
			q.next = tmp;
		}

		size++;
	}
	
	public PQNode<T> serve()
	{
		PQNode<T> node = head;
		head = head.next;

		size--;

		return node;
	}
}