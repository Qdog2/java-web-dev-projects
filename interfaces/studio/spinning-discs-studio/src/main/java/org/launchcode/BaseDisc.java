package org.launchcode;

public abstract class BaseDisc {

    private String brand;
    private double storageCapacity;
    private String contents;
    private String discType;
    private double length;

    public BaseDisc(String brand, double storageCapacity, String contents, String discType, double length) {
        this.brand = brand;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.discType = discType;
        this.length = length;
    }

    public BaseDisc(String movieTitle, int movieLength) {
    }

    public BaseDisc(String band, String songName, int songLength) {
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
