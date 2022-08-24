package lesson7;

/*2) Create a new interface "Converter". This interface should have one method "convert(double celsius)".
        Provide several implementations of the "Converter" interface like "KelvinConverter" and "FahrenheitConverter"
        which convert celsius degrees to kelvins or fahrenheits accordingly.*/


public class FahrenheitConverter implements Converter {

    public double convert(double celsius) {
        return Math.round((celsius * 9.00 / 5.00 + 32.00) * 100.00) / 100.00;
    }

    public static void main(String[] args) {
        FahrenheitConverter far = new FahrenheitConverter();
        double celsius = (Math.random() * 60.00) - 30.00;
        System.out.println(celsius);
        System.out.println(far.convert(celsius));
    }

}
