import java.util.ArrayList;

public class WeatherData {

    private static ArrayList<Double> temperatures;


    public WeatherData() {
        temperatures = new ArrayList<Double>();
    }

    public void cleanData(double lower, double upper) {
        for(int i = 0; i < temperatures.size(); i++){
            if (temperatures.get(i) < 85.0 && temperatures.get(i) > 120.0){
                temperatures.remove(i);
                i--;
            }
        }
    }

    public int longestHeatWave(double threshold) {
        int consecutive = 0;
        int counter= 0;
        for(int i = 0; i < temperatures.size(); i++){
            if (temperatures.get(i) > threshold){
                counter++;

            }
            else{
                break;
            }
        }
        if (counter > consecutive){
            consecutive = counter;
        }
        return consecutive;
    }

    public static void main(String[] args) {
        temperatures.add(99.1);
        temperatures.add(85.0);
        temperatures.add(85.1);
        temperatures.add(94.3);
        temperatures.add(98.0);
        temperatures.add(101.0);
        temperatures.add(102.5);
        WeatherData weatherData = new WeatherData();
        weatherData.cleanData(85.0, 120.0);
        for(int i = 0; i < temperatures.size(); i++){
            System.out.println(temperatures.get(i));
        }

    }



}