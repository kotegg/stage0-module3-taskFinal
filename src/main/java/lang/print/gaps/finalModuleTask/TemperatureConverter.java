package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double temp = (double) temperatureCelsius;
        System.out.println(temp * (9.0/5) + 32);
    }
}
