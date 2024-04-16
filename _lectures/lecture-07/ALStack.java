import java.util.ArrayList;

interface Stack<E> {
	void push(E element);
	E pop();
	int size();
	E peek();
}

public class ALStack<E> implements Stack<E> {
	ArrayList<E> contents;

	ALStack() {
		this.contents = new ArrayList<>();
	}

	public void push(E element) {
		this.contents.add(element);
	}

	public E pop(){
		return this.contents.remove(this.contents.size() - 1);
	}

	public int size(){
		return this.contents.size();
	}
	
	public E peek(){
		return this.contents.get(this.contents.size() - 1);
	}

	public String toString() {
		return this.contents.toString() + "<- top";
	}
}
