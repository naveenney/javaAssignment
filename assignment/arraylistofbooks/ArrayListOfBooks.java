package assignment.arraylistofbooks;

import java.util.ArrayList;

public class ArrayListOfBooks {

	public static void addBook(ArrayList<Book> books, String title, String author) {
		Book book = new Book(title, author);
		books.add(book);
	}

	public static void main(String[] args) {

		ArrayList<Book> books = new ArrayList<>();

		addBook(books, "Making India Awesome", "Chetan Bhagat");
		addBook(books, "One Indian Girl", "Chetan Bhagat");
		addBook(books, "Revolution 2020", "Chetan Bhagat");

		System.out.println("List of Books:");
		for (Book book : books) {
			System.out.println(book);
		}

	}

}

class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String toString() {
		return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + '}';
	}
}
