package DoublyLinkedList.LibraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        library.addBookAtEnd("The Hobbit", "J.R.R. Tolkien", "Fantasy", 101, true);
        library.addBookAtBeginning("1984", "George Orwell", "Dystopian", 102, false);
        library.addBookAtPosition("To Kill a Mockingbird", "Harper Lee", "Fiction", 103, true, 2);

        System.out.println("Books in forward order:");
        library.displayBooksForward();

        System.out.println("\nBooks in reverse order:");
        library.displayBooksReverse();

        System.out.println("\nTotal books in the library: " + library.countBooks());

        System.out.println("\nSearch by Title (1984): ");
        System.out.println(library.searchByTitle("1984"));

        System.out.println("\nSearch by Author (Harper Lee): ");
        System.out.println(library.searchByAuthor("Harper Lee"));

        library.updateAvailabilityStatus(103, false);
        System.out.println("\nAfter updating availability of 'To Kill a Mockingbird':");
        library.displayBooksForward();

        System.out.println("\nRemove book with ID 102:");
        library.removeBookById(102);
        library.displayBooksForward();
    }
}
