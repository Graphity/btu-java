package ge.edu.btu;

public class Passenger {
    private String name;
    private Boolean ticket;

    public Passenger(String name, Boolean ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public boolean haveTicket() {
        return ticket;
    }
}
