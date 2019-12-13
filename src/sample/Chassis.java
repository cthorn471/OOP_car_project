package sample;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public interface Chassis {
    /**
     * Declare constants.
     */
    public final String chassis = "Chassis";
    /**
     * Declare method definitions.
     */
    public Chassis getChassisType();
    public void setChassisType(String vehicleChassis);
}
