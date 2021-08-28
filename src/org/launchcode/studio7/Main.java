package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        DVD littleRascals = new DVD(500.14, 1200,92);
        CD bestOf80s = new CD(214.78, 500, 17);

        littleRascals.startDisc();
        littleRascals.spinDisc();
        littleRascals.ejectDisc();
        System.out.println("\n");
        bestOf80s.startDisc();
        bestOf80s.spinDisc();
        bestOf80s.ejectDisc();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
