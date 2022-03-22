public class BaseConverter {
    public static void main(String[] args) {
        double temperature = 23.5;
        System.out.println("t = " +
                new CelsiusConverter().getConvertedValue(temperature) + " C");
        System.out.println("t = " +
                new KelvinConverter().getConvertedValue(temperature) + " K");
        System.out.println("t = " +
                new FahrenheitConverter().getConvertedValue(temperature) + " F");
    }
}