import java.util.ArrayList;

interface Queue<E> {
	void enqueue(E element);
	E dequeue();
	int size();
	E peek();
}

public class ALQueue<E> implements Queue<E>{
	/* private */ ArrayList<E> contents;

	ALQueue() {
		this.contents = new ArrayList<>();
	}

	public void enqueue(E element) {
		this.contents.add(element);
	}
	
	public E dequeue() {
		E temp = this.contents.remove(0);
		return temp;
	}
	
	public int size() {
		return this.contents.size();
	}

	public E peek() {
		E temp = this.contents.get(0);
		return temp;
	}

	public String toString() {
		return "front -> " + this.contents.toString() + "<- back";
	}
}
