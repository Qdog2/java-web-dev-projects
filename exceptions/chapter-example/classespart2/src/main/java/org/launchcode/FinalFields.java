package org.launchcode;

public class FinalFields {

        public final int intValue = 42;
        //public final double doubleValue;
        public final FortyTwo objectValue = new FortyTwo();

        public static void main(String[] args) {
            FinalFields demo = new FinalFields();

            //this would result in a compiler error
            //demo.intValue = 0;

            //this is allowed since we haven't initialized double value yet
            //demo.doubleValue = 42.0;

            //however, this would result in a compiler error
            //demo.doubleValue = 0;


        }

}
