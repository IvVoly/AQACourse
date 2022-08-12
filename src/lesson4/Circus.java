package lesson4;
/*
10. Create a simple class with overloaded methods. Write another class to demonstrate the concept
of methods overloading.
 */

public class Circus {
    int animals;
    int employees;
    int attractions;

    public Circus(int animals, int employees, int attractions){
        this.animals = animals;
        this.employees = employees;
        this.attractions = attractions;
    }
    public Circus(){

    }

    public double salary(int employees, int visitors, int attractions) {
        int standart = 2000;
        if (visitors > 3000) {
            return standart * employees * 1.10;
        } else if (visitors > 1500 && attractions > 20) {
            return standart * employees * 1.05;
        } else {
            return standart * employees;
        }
    }
    public double salary(int employees, int visitors){
            int standart = 2000;
            if(visitors > 3000){
                return standart*employees*1.10;
            }else{
                return standart*employees;
            }
    }
    public double salary(int employees){
        int standart = 2000;
        return  standart*employees;
    }
}

