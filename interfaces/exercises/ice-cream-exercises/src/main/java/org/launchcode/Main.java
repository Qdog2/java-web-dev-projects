package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(new FlavorComparator());
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConesComparator());
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for(int i = 0; i < flavors.size(); i++) {
            System.out.println(flavors.get(i));
        }

        for(int j = 0; j < cones.size(); j++) {
            System.out.println(cones.get(j));
        }

    }
}