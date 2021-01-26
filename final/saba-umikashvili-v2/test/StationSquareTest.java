import ge.edu.btu.Passenger;
import ge.edu.btu.Train;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StationSquareTest {
    @Test
    public void testStationSquare() {
        Passenger gio = new Passenger("Gio", true);
        Passenger nika = new Passenger("Nika", false);
        Passenger ana = new Passenger("Ana", true);

        Train train = new Train();
        assertTrue(train.addPassenger(gio));
        assertFalse(train.addPassenger(nika));
        assertTrue(train.addPassenger(ana));
    }
}