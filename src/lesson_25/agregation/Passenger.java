package lesson_25.agregation;

public class Passenger {

    private final int id;
    private String name;
    private String ticketNumber;

    private static int counter;



    public Passenger(String name) {
        this.name = name;
        this.id = counter++;
    }

    public String toString() {
        return "{Passenger id:" + id + "; name: " + name + "; " + (ticketNumber != null ? "Ticket " + ticketNumber : "") + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getId() {
        return id;
    }

}
