import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] datapoints = new int[100];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 100; i++){
            datapoints[i] = rnd.nextInt(100)+ 1;
        }
        for(int i = 0; i < datapoints.length; i++){
            System.out.print(datapoints[i]);
            System.out.print(" | ");

        }
        System.out.println();
        int sum = 0;
        double average = 0;
        for(int i = 0; i < datapoints.length; i ++){
            sum += datapoints[i];
            average = (double) sum / datapoints.length;
            System.out.println("The sum of the array is: "+ sum);
            System.out.println("The average of the array values is: " + average);
        }
        int input = SafeInput.getRangedInt(in, "Please enter a integer", 1, 100);

        boolean found = false;
        for(int i = 0; i < datapoints.length; i++){
            if (datapoints[i] == input){
                System.out.println("Your integer was found at index "+ i);
                found = true;
            }
            if(!found){
                System.out.println("Your integer was not found in the array");
            }
        }
        int search = SafeInput.getRangedInt(in, "Please enter another integer", 1, 100);
        for( int i = 0; i < datapoints.length; i++){
            if(datapoints[i] == search){
                System.out.println("Your integer " + search + " was found first at index "+ i);
                found = true;
                break;
            }
            if(!found){
                System.out.println("Your integer was not found in the array at all");
            }
        }
        int max = datapoints[0];
        int min = datapoints[0];
        for(int i = 1; i < datapoints.length; i++){
           if(datapoints[i] > max){
               max = datapoints[i];
           }
           if(datapoints[i] < min){
               min = datapoints[i];
           }
        }
        System.out.println("The minimum value is " + min);
        System.out.println("The maximum value is " + max);
        System.out.println();
        System.out.println("The average of the datapoints is: "+ getAverage(datapoints));
    }
    public static double getAverage(int values[]){
        double sum = 0;
        for(double value : values){
            sum += value;
        }
        return sum / values.length;
    }
}
