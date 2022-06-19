import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args)
    {
        double meters = 0;
        double miles;
        double feet;
        double inches;
        String trash;

        final double METER_TO_MILE = 1609.34;
        final double METER_TO_FEET = 3.281;
        final double METER_TO_INCHES = 39.37;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a measurement in meters: ");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine();
            miles = meters / METER_TO_MILE;
            feet = meters * METER_TO_FEET;
            inches = meters * METER_TO_INCHES;

            System.out.println(meters + " meters is " + miles + " miles");
            System.out.println(meters + " meters is " + feet + " feet");
            System.out.println(meters + " meters is " + inches + " inches");
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Enter a valid measurement: " + trash);
        }


    }

}
