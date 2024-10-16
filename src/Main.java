import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Driver> driverList = new ArrayList<>();
        driverList.add(new Driver("John", 2.5));
        driverList.add(new Driver("Alice", 1.8));
        driverList.add(new Driver("Bob", 3.0));

        DriverList drivers = new DriverList(driverList);
        DriverIterator iterator = drivers.iterator();

        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println("Driver: " + driver.getName() + ", Distance: " + driver.getDistance());
        }
    }
}
