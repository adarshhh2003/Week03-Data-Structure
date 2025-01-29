package DoublyLinkedList.MovieManagementSystem;

public class MovieManagement {
    Movie head;
    Movie tail;

    public void addMovieAtBegining(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if(head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if(tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void addMovieAtPosition(int position, String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if(position <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        if(position == 1) {
            addMovieAtBegining(title, director, year, rating);
            return;
        }

        Movie current = head;
        for(int i=1; i<position-1; i++) {
            if(current == null) {
                System.out.println("Position exceeds list lenght");
                return;
            }
            current = current.next;
        }
        newMovie.next = current.next;
        if(current.next != null) {
            current.next.prev = newMovie;
        } else {
            tail = newMovie;
        }
        current.next = newMovie;
        newMovie.prev = current;
    }

    public void removeMovie(String title) {
        if(head == null) {
            System.out.println("No movies in the list");
            return;
        }
        Movie current = head;
        while(current != null) {
            if(current.title.equals(title)) {
                if(current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if(current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                System.out.println("Movie removed successfully");
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found");
    }

    public void searchMovie(String director, double rating) {
        Movie current = head;
        boolean found = false;

        while(current != null) {
            if((director != null && current.director.equals(director)) || (current.rating == rating)) {
                System.out.println("Record Found: " + current.title + ", " + current.director + ", " + current.year + ", " + current.rating);
                found = true;
            }
            current = current.next;
        }

        if(!found) {
            System.out.println("No matching movie found");
        }
    }

    public void displayMovieForward() {
        Movie current = head;
        if(head == null) {
            System.out.println("Movies list is empty");
            return;
        }

        while(current != null) {
            System.out.println(current.title + ", " + current.director + ", " + current.year + ", " + current.rating);
            current = current.next;
        }
    }

    public void displayMovieReverse() {
        if(tail == null) {
            System.out.println("Movies list is empty");
            return;
        }

        Movie current = tail;
        while(current != null) {
            System.out.println(current.title + ", " + current.director + ", " + current.year + ", " + current.rating);
            current = current.prev;
        }
    }

    public void updateRating(String title, double newRating) {
        if(head == null) {
            System.out.println("Movie list is empty");
            return;
        }

        Movie current = head;

        while(current != null) {
            if(current.title.equals(title)) {
                current.rating = newRating;
                System.out.println("Rating updated successfully");
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found");
    }
}
