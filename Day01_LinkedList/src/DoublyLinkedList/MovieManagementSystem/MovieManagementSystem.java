package DoublyLinkedList.MovieManagementSystem;

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieManagement movie = new MovieManagement();

        movie.addMovieAtBegining("Inception", "Christopher", 2010, 8.8);
        movie.addMovieAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movie.addMovieAtBegining("The Matrix", "The Wachowskis", 1999, 8.7);
        movie.addMovieAtPosition(2, "The Dark Knight", "Christopher Nolan", 2008, 9.0);

        System.out.println("Movies in forward order");
        movie.displayMovieForward();

        System.out.println("Movies in reverse order");
        movie.displayMovieReverse();

        System.out.println("Searching for movie");
        movie.searchMovie("Christopher", 8.8);

        System.out.println("Update rating");
        movie.updateRating("Inception", 9.8);

        System.out.println("Movies after rating update");
        movie.displayMovieForward();

        System.out.println("Removing movie 'The Matrix'");
        movie.removeMovie("The Matrix");

        System.out.println("After removing the movie");
        movie.displayMovieForward();
    }
}
