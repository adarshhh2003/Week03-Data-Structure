package CircularLinkedList.OnlineTicketReservationSystem;

public class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }

    @Override
    public String toString() {
        return "TicketID: " + ticketId + ", Customer: " + customerName + ", Movie: " + movieName + ", Seat: " + seatNumber + ", Time: " + bookingTime;
    }
}
