package typesOfConstructor;

import typesOfConstructor.vehicle;

public class privateConstructor {
    public static void main(String []args) {
        vehicle vObj = vehicle.getVehicle(4, 2008);
        System.out.println("vObj numWheels = " + vObj.numWheels);
        System.out.println("vObj year = " + vObj.year);
    }
}
