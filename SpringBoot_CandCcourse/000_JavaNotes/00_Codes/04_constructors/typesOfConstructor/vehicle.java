package typesOfConstructor;

public class vehicle {
    public
    int numWheels;
    int year;

    private vehicle(int wheels, int year) {
        this.numWheels = wheels;
        this.year = year;
    }

    public static vehicle getVehicle(int w, int y) {
        vehicle v1 = new vehicle(w, y);
        return v1;
    }
}