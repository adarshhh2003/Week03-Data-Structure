package DoublyLinkedList.LibraryManagementSystem;

public class LibraryManagement {
    private Book head = null;
    private Book tail = null;

    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            newBook.prev = tail;
            tail.next = newBook;
            tail = newBook;
        }
    }

    public void addBookAtPosition(String title, String author, String genre, int bookId, boolean isAvailable, int position) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (position <= 1 || head == null) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }

        Book temp = head;
        int count = 1;
        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        newBook.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newBook;
        } else {
            tail = newBook;
        }
        temp.next = newBook;
        newBook.prev = temp;
    }

    public void removeBookById(int bookId) {
        if (head == null) return;

        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public Book searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Book searchByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void updateAvailabilityStatus(int bookId, boolean isAvailable) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayBooksForward() {
        if (head == null) {
            System.out.println("No books in the library.");
            return;
        }

        Book temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("No books in the library.");
            return;
        }

        Book temp = tail;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
