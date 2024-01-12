package org.launchcode;
public class Main {

    public static void main(String[] args) {
        //TODO: Create 5 menu items in different categories
        MenuItem item1 = new MenuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.39, "main courses");
        MenuItem item2 = new MenuItem("Toasted Ravioli", "A St. Louis favorite, served with a side of pizza sauce", 6.88, "appetizer");
        MenuItem item3 = new MenuItem("Gooey Butter Cake", "The ooiest dessert this side of the Mississippi", 4.99, "dessert");
        MenuItem item4 = new MenuItem("Veggie Pizza", "Peppers, onion, mushrooms, olives, and tomatoes make a delicious combo", 4.39, "main course");
        MenuItem item5 = new MenuItem("Garlic Breadsticks", "Hot, garlicky carbs FTW", 4.59, "appetizer");

        System.out.println(item1.isNew());
        //TODO: Print first item
        System.out.println(item1);

        //TODO: Create menu
        Menu menu = new Menu();

        //TODO: Add items to menu and print it
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
        System.out.println(menu);

        //TODO: Remove an item and print menu
        menu.removeItem(item5);
        System.out.println(menu);

        System.out.println(item1.equals(item2));



        //BONUS MISSION

        //TODO: Attempt to add a duplicate item, then print menu to confirm it wasn't added
    }
}
