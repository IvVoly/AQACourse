package lesson5;
/* 13. What is the different between static and non-static field of a class?
        Create an example to demonstrate this concept.*/

public class TestCourse {
    public static void main(String[] args) {
        Course first = new Course();
        // non - static fields use only with an Object of class
        System.out.printf("non-static: %d \n", first.teachers);
        System.out.printf("static: %d", Course.students); // static fields can use without creation an object of class
    }
}
