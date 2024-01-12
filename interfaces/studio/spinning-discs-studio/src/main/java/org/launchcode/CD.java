package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String brand, double storageCapacity, String contents, String discType, double length) {
        super(brand, storageCapacity, contents, discType, length);
    }
    private String band;
    private String songName;
    private int songLength;

    public CD(String band, String songName, int songLength) {
        super(band, songName, songLength);
        this.band = band;
        this.songName = songName;
        this.songLength = songLength;
    }
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void discLength() {
        System.out.println("The song " + this.songName + " by " + this.band + " is " + this.songLength + " minutes long.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
