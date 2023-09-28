import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleTest {
    Car car = null;
    Motorcycle motorcycle = null;

    @BeforeEach
    public void createObjects() {
        car = new Car("Kia", "Rio", 2022);
        motorcycle = new Motorcycle("Suzuki", "KATANA", 2018);
    }

    @Test
    public void allTests() {
        assertInstanceOf(Vehicle.class, car);
        assertEquals(4, car.getNumWheels());
        assertEquals(2, motorcycle.getNumWheels());

        car.testDrive();
        assertEquals(60,car.getSpeed());

        motorcycle.testDrive();
        assertEquals(75,motorcycle.getSpeed());

        car.testDrive();
        car.park();
        assertEquals(0,car.getSpeed());

        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0,motorcycle.getSpeed());

    }

}