package lesson5;

/*
6. Take the classes from the task 1. Create a new test class.
Import everything (*) from your created packages.
Now try to create objects of your classes without specifying the packages in front of the class names.
 What happened?  === will be errors "java: cannot find symbol"
 How can we avoid this?
 */

import lesson5.factory.*;

public class Release {
    public static void main(String[] args) {   // How can we avoid this?
        lesson5.general.Model model1 = new lesson5.general.Model(); // We use class Model from package "general"
        Model model2 = new Model();  // We use class Model from import package "factory"
    }
}
