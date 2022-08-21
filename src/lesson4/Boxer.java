package lesson4;

/*
2. Implement the method fight() depending on weight, strength and age of the boxer:
        You should write the dependency by yourself. The method should return true or false if our boxer won or lost.
        Requirements:
a) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;
*/

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        int power = strength;
        int power2 = anotherBoxer.strength;
        if(weight > anotherBoxer.weight){
            power+=7;
        }else{
            power2+=7;
        }
        if(age >= 24 && age <=29){
            power+=5;
        }
        if(anotherBoxer.age >= 24 && anotherBoxer.age <=29){
            power2+=5;
        }
        return power > power2;
    }

    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(27,83,55);
        Boxer anotherBoxer = new Boxer(25,78,60);
        System.out.println(ourBoxer.fight(anotherBoxer));
        System.out.println(anotherBoxer.fight(ourBoxer));
    }
}
