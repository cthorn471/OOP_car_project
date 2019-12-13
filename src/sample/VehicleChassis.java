package sample;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class VehicleChassis implements Chassis {

    // Declare generic chassis variable.
    private String chassisName;

    /**
     * Constructor for objects of class VehicleChassis
     */
    public VehicleChassis() {
        this.chassisName = Chassis.chassis;
    }

    /**
     * Overload constructor for objects of class VehicleChassis
     */
    public VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }

    // Implement interface methods.
    public Chassis getChassisType() {
        return this;
    }

    // Implement interface methods.
    public void setChassisType(String vehicleChassis) {
        this.chassisName = vehicleChassis;
    }

    /*
     * Override the toString() method.
     */
    public String toString() {
        return "Chassis Name : " + this.chassisName;
    }

    /* Test Driver */
    public static void main(String[] args) {

        // Test default constructor and print instance attributes.
        System.out.println("------------------------------------------------------------ ");
    }
}
