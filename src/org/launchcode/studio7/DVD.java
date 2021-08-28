package org.launchcode.studio7;

import java.sql.SQLOutput;

public class DVD extends BaseDisc implements OpticalDisc {

    private int length;
    public DVD(Double storageCapacity, Integer rPM, int length) {
        super(storageCapacity, rPM);
        this.length = length;
    }

    @Override
    public void spinDisc() {
        System.out.println("Whirling at " + rPM + " RPMs");
    }
    @Override
    public void startDisc(){
        System.out.println("Select option from main menu \nTitle length: " + length + " Minutes");
    }
    @Override
    public void ejectDisc() {
        System.out.println("Disc pops out in tray");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
