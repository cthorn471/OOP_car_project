package sample;

public class VehicleFrame implements Chassis {
    // Instance variables.
    private String vehicleFrameType;
    /**
     * Constructor for objects of class VehicleFrame
     */
    public VehicleFrame() {
        this.vehicleFrameType = "Unibody"; }

    /**
     * Overloaded constructor for objects of class VehicleFrame
     */
    public VehicleFrame(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType; }
    /**
     * Declare method definitions.
     */
    public Chassis getChassisType() {
        return this; }

    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType; }
    /*
     * Override the toString() method.
     */
    public String toString() {
        // Print instance description.
        return "Chassis : " + Chassis.chassis + "\n" +
                "Vehicle Frame : " + this.vehicleFrameType;
    }

    /*
     * Test cases for the class instances.
     */
    public static void main(String[] args) {
        // Test default constructor and print instance attributes.
        System.out.println("------------------------------------------------------");
        VehicleFrame vf1 = new VehicleFrame();
        System.out.println(vf1);
        // Test overloaded constructor and print instance attributes.
        System.out.println("------------------------------------------------------");
        VehicleFrame vf2 = new VehicleFrame("Ladder Frame");
        System.out.println(vf2);
        System.out.println("------------------------------------------------------");
    }
}
