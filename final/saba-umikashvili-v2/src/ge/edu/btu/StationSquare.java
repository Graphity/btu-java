package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passenger gio = new Passenger("Gio", true);
        Passenger nika = new Passenger("Nika", false);
        Passenger ana = new Passenger("Ana", true);

        Train train = new Train();
        train.addPassenger(gio);
        train.addPassenger(nika);
        train.addPassenger(ana);

        for (Passenger passenger: train.getPassengerList())
            System.out.println(passenger.getName());
    }
}
