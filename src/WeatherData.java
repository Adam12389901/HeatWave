import java.util.ArrayList;

public class WeatherData {

    private ArrayList<Double> temperatures;


    public void cleanData(double lower, double upper) {
        for(int i = 0; i < temperatures.size(); i++){
            if (temperatures.get(i) < 85.0 && temperatures.get(i) > 120.0){
                temperatures.remove(i);
                i--;
            }
        }
    }

    public int longestHeatWave(double threshold) {

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }



}