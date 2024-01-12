package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String brand, double storageCapacity, String contents, String discType, double length) {
        super(brand, storageCapacity, contents, discType, length);
    }

    private String movieTitle;
    private int movieLength;

    public DVD(String movieTitle, int movieLength) {
        super(movieTitle, movieLength);
        this.movieTitle = movieTitle;
        this.movieLength = movieLength;
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void discLength() {
        System.out.println("The length of " + this.movieTitle + " is " + this.movieLength + " hours long");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
