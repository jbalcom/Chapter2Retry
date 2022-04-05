package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String test = "Booze";
        String test1 = test;
        System.out.println(test + " " + test1);
        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());
        test = "Alcohol";
        System.out.println(test + " " + test1);
        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());
        String test2 = "Booze";
        test = "Booze";
        System.out.println(test2.hashCode());
        System.out.println(test.hashCode());
        test = "Alcohol";
        System.out.println(test.hashCode());

        Scanner scan = new Scanner(System.in);
        System.out.println("Problem 2.5:");
        System.out.println();
        final int BASE = 32;
        final double CONVERSION_FACTOR = 5.0 / 9.0;
        double celsiusTemp;
        double fahrenheightTemp;
        System.out.print("Enter degrees in Fahrenheight to convert to celsius: ");
        fahrenheightTemp = scan.nextDouble();

        celsiusTemp = (fahrenheightTemp - BASE) * CONVERSION_FACTOR;

        System.out.println("Celsius Temperature: " + celsiusTemp);

        System.out.println("\nProblem 2.6:\n");

        float miles, kilometers;
        final float CONVERSION_FLOAT = 1.60935f;
        System.out.print("Enter in miles to convert to kilometers: ");

        miles = scan.nextFloat();

        kilometers = miles * CONVERSION_FLOAT;

        System.out.println(miles + " miles converted to kilometers is " + kilometers + " km");

        System.out.println("\nProblem 2.7:\n");

        int speed, distance;
        System.out.print("Enter in a speed to travel: ");
        speed = scan.nextInt();
        System.out.print("Enter in a distance to travel: ");
        distance = scan.nextInt();

        float time = (float) distance / speed;

        System.out.print("It takes " + time + " hour(s) to travel " + distance + " miles at " + speed + " mph.");

        System.out.println("\n\nProblem 2.8:\n");

        int m = 0;
        int km = 0;
        int cm = 0;
        int cmConvert = 0;
        System.out.print("Enter kilometers: ");
        km = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter meters: ");
        m = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter centimeters: ");
        cm = scan.nextInt();
        scan.nextLine();

        cmConvert = (m * 100) + (km * 100000) + cm;
        System.out.print(km + " kilometers and " + m + " meters and " + cm + " centimeters is equivalent to " + cmConvert + " centimeters");

        System.out.println("\n\nProblem 2.9:\n");

        int kmConvert = 0;
        int mConvert = 0;

        System.out.print("Enter centimeters: ");
        cmConvert = scan.nextInt();
        scan.nextLine();
        cm = cmConvert;

        kmConvert = cmConvert / 100000;
        mConvert = (cmConvert % 10000) / 100;
        cmConvert = cmConvert % 100;

        System.out.print("There are " + kmConvert + " km, " + mConvert + " m, and " + cmConvert + " cm in " + cm + " cm.");

        System.out.println("\n\nProblem 2.10:\n");

        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        double total = 0.0;

        System.out.println("How many coins are in the Jar?");
        System.out.print("How many Quarters? ");
        quarters = scan.nextInt();
        scan.nextLine();
        System.out.print("How many Dimes? ");
        dimes = scan.nextInt();
        scan.nextLine();
        System.out.print("How many Nickels? ");
        nickels = scan.nextInt();
        scan.nextLine();
        System.out.print("How many Pennies? ");
        pennies = scan.nextInt();
        scan.nextLine();

        total = (double) (quarters * .25) + (dimes * .10) + (nickels * .05) + (pennies * .01);

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("The total amount of money in the jar is " + nf.format(total) + ".");

        System.out.println("\nProblem 2.11:\n");

        int centiHold = 0;
        double meterHold = 0.0;

        System.out.print("Enter the total distance needed in meters: ");
        meterHold = scan.nextDouble();


        centiHold = (int) (meterHold * 100);
        System.out.println("You entered: " + centiHold + " cm" + "\n");

        int tenMet = centiHold / 1000;
        centiHold = centiHold % 1000;
        int fiveMet = centiHold / 500;
        centiHold = centiHold % 500;
        int oneMet = centiHold / 100;
        centiHold = centiHold % 100;
        int tfCent = centiHold / 25;
        centiHold = centiHold % 25;
        int tenCent = centiHold / 10;
        centiHold = centiHold % 10;
        int fiveCent = centiHold / 5;
        centiHold = centiHold % 5;

        System.out.println(tenMet + " ten m length");
        System.out.println(fiveMet + " five m length");
        System.out.println(oneMet + " one m length");
        System.out.println(tfCent + " twenty-five cm length");
        System.out.println(tenCent + " ten cm length");
        System.out.println(fiveCent + " five cm length");
        System.out.println(centiHold + " one cm length\n");

        int tot = tenMet + fiveMet + oneMet + tfCent + tenCent + fiveCent + centiHold;
        System.out.println("Total: " + tot + " lengths of pipes");

        System.out.println("\nProblem 2.12:\n");

        int side = 0;

        System.out.print("Enter a side for a square: ");
        side = scan.nextInt();
        scan.nextLine();

        System.out.println("The perimeter of the square is " + (side * 4) + " and the area is " + (side * side) + ".");

        System.out.println("\nProblem 2.13:\n");

        int num = 0;
        int denom = 0;
        float fraction = 0.0f;

        System.out.print("Enter a numerator: ");
        num = scan.nextInt();
        scan.nextLine();

        while (denom == 0) {
            System.out.print("Enter a denominator (must not be 0): ");
            denom = scan.nextInt();
            scan.nextLine();
        }

        fraction = (float) num / denom;

        System.out.println("The decimal of " + num + "/" + denom + " is " + fraction + ".");
        System.out.println("I love you so much!!!!!!");
    }
}