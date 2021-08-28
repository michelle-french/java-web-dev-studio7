package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    private int tracks;

    public CD(Double storageCapacity,Integer rPM, int tracks) {
        super(storageCapacity, rPM);
        this.tracks = tracks;
    }

    @Override
    public void spinDisc() {
        System.out.println("Whirling at " + rPM + " RPMs");
    }
    @Override
    public void startDisc(){
        System.out.println("Push disc into player, autoplay starts the disc.\nSelect from " + tracks + " tracks.");
    }

    @Override
    public void ejectDisc() {
        System.out.println("Press button, disc pops out of player.");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
