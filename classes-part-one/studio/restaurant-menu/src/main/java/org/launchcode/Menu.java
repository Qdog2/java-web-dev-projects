package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //Allow for default constructor


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("mainCourse")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder desserts = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nTONY'S PIZZA MENU\n" +
                "APPETIZERS" + appetizers + "\n" +
                "MAIN COURSES" + mainCourses + "\n" +
                "DESSERTS" + desserts + "\n";
    }

    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }

    //TODO: Test equals method

}
