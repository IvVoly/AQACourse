package lesson5.general;

//8. Answer the question: What is a public access? Create a simple program to demonstrate the public access.

import lesson5.factory.Structure;

public class Info {
    public static void main(String[] args) {
        Structure structure = new Structure();
        structure.showRegion(); // public access in any packages
    }
}
