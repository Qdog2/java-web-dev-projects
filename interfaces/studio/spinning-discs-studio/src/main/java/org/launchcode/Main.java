package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("One Direction", "What Makes You Beautiful", 3);
        DVD myDVD = new DVD("Titanic", 4);
        myCd.spinDisc();
        myCd.discLength();
        myDVD.spinDisc();
        myDVD.discLength();
        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}