package assignment.circularbuffer;

public class Main {

	public static void main(String[] args) {
	        CircularBuffer buffer = new CircularBuffer(5);
	        buffer.addMessage("Message 1");
	        buffer.addMessage("Message 2");
	        buffer.addMessage("Message 3");
	        buffer.addMessage("Message 4");
	        buffer.addMessage("Message 5");
	        buffer.addMessage("Message 6"); 
	        
	        buffer.displayMessages();
	    }
}
