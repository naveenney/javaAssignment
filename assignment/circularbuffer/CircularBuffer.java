package assignment.circularbuffer;

import java.util.ArrayList;

public class CircularBuffer {

	private ArrayList<String> buffer;
	private int maxSize;
	private int currentSize;
	private int head;

	public CircularBuffer(int maxSize) {
		this.maxSize = maxSize;
		buffer = new ArrayList<>(maxSize);
		currentSize = 0;
		head = 0;
	}

	public void addMessage(String message) {
		if (currentSize < maxSize) {
			buffer.add(message);
			currentSize++;
		} else {
			buffer.set(head, message);
			head = (head + 1) % maxSize;
		}
	}

	public void displayMessages() {
		for (String message : buffer) {
			System.out.println(message);
		}
	}

}
