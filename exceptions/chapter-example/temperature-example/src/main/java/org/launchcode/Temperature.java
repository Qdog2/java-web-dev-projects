package org.launchcode;

public class Temperature {
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            try {
                throw new TemperatureException("That temperature is too low!");
            } catch (TemperatureException e) {
                e.printStackTrace();
            }
        }

        fahrenheit = aFahrenheit;
    }

    //referring to a static field

    //within a class

    //use a static field the same way as normal, a non-static field
    //System.out.println("Absolute zero in F is: " + absoluteZeroFahrenheit);

    //we can also be more explicit
    //System.out.println("Absolute zero in F is: " + this.absoluteZeroFahrenheit);

    //outside a class

    //if the static field is public, we can do this
    //System.out.println("Absolute zero in F is: " + Temperature.absoluteZeroFahrenheit);

    //Or if we have an object named "temp" of type Temperature
    //System.out.println("Absolute zero in F is: " + temp.absoluteZeroFahrenheit);


}
