package CircularLinkedList.OnlineTicketReservationSystem;

public class TicketReservation {
    private Ticket head = null;

    public void addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            head.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
    }

    public void removeTicket(int ticketId) {
        if (head == null) return;
        Ticket temp = head, prev = null;
        do {
            if (temp.ticketId == ticketId) {
                if (prev == null) {
                    Ticket last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    if (head == head.next) {
                        head = null;
                    } else {
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket temp = head;
        do {
            System.out.println(temp);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTicket(String query) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }
        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                System.out.println(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No ticket found for: " + query);
        }
    }

    public int totalTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}
