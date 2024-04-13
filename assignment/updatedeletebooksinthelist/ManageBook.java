package assignment.updatedeletebooksinthelist;

import java.util.ArrayList;

public class ManageBook {
	ArrayList<Book> bookList;

	public ManageBook() {
		bookList = new ArrayList<>();
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	public void updateBook(int index, Book updatedBook) {
		if (index >= 0 && index < bookList.size()) {
			bookList.set(index, updatedBook);
		} else {
			System.out.println("Invalid index.");
		}
	}

	public void deleteBook(int index) {
		if (index >= 0 && index < bookList.size()) {
			bookList.remove(index);
		} else {
			System.out.println("Invalid index.");
		}
	}
}