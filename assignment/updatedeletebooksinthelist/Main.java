package assignment.updatedeletebooksinthelist;


public class Main {

	public static void main(String[] args) {
		ManageBook bookManager = new ManageBook();

		bookManager.addBook(new Book("A Million Mutinies Now ", "V.S.Naipaul"));
		bookManager.addBook(new Book("A Bend in the River ", "V.S.Naipaul"));
		bookManager.addBook(new Book("A Passage to England ","Nirad C. Chaudhuri"));

		System.out.println("Books in the list:");
		for (Book book : bookManager.bookList) {
			System.out.println(book.getTitle() + " by " + book.getAuthor());
		}

		Book updatedBook = new Book("Updated Book", "Updated Author");
		bookManager.updateBook(1, updatedBook);

		System.out.println("\nBooks in the list after update:");
		for (Book book : bookManager.bookList) {
			System.out.println(book.getTitle() + " by " + book.getAuthor());
		}
		bookManager.deleteBook(0);

		System.out.println("\nBooks in the list after delete:");
		for (Book book : bookManager.bookList) {
			System.out.println(book.getTitle() + " by " + book.getAuthor());
		}
	}
}
