import java.util.ArrayList;

public class WeatherData {

    private static ArrayList<Double> temperatures;


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
        }
        if (counter > consecutive){
            consecutive = counter;
        }
        return consecutive;
    }

    public static void main(String[] args) {
        temperatures.add(100.7);
        temperatures.add(120.6);
        temperatures.add(120.7);
        temperatures.add(120.6);
        temperatures.add(120.7);
        System.out.println(temperatures.get(0));
    }



}