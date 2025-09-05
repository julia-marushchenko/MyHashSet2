// Java program to use HashSet

package com.collections;

import java.util.HashSet;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating HashSet;
        HashSet<String> set = new HashSet<>();

        // Adding elements to HashSet
        set.add("Chanel");
        set.add("Dior");
        set.add("Hermes");
        set.add("Bench");
        set.add("Tiffany");
        set.add("HM");

        // Printing set size to console
        System.out.println("Set size is: " + set.size());

        // Printing elements of the set to console
        for (String element : set) {
            System.out.println(element);
        }

        // Checking if there is an element with value ´Hermes´
        System.out.println("Contains ´Hermes´: " + set.contains("Hermes"));

        // Removing element with value ´Dior´
        set.remove("Dior");

        // Printing set size to console
        System.out.println("Set size is: " + set.size());

        // Printing elements of the set to console
        for (String element : set) {
            System.out.println(element);
        }

        // Removing all the elements from the set
        set.clear();

        // Printing set size to console
        System.out.println("Set size is: " + set.size());
    }
}