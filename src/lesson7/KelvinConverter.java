package lesson7;

/*2) Create a new interface "Converter". This interface should have one method "convert(double celsius)".
        Provide several implementations of the "Converter" interface like "KelvinConverter" and "FahrenheitConverter"
        which convert celsius degrees to kelvins or fahrenheits accordingly.*/


public class KelvinConverter implements Converter {
    @Override
    public double convert(double celsius) {
        return Math.round((celsius + 273.15) * 100.00) / 100.00;
    }

    public static void main(String[] args) {
        KelvinConverter kel = new KelvinConverter();
        double celsius = (Math.random() * 60.00) - 30.00;
        System.out.println(celsius);
        System.out.println(kel.convert(celsius));
    }
}
