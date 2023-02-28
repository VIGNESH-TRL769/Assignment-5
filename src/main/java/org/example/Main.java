package org.example;
import java.util.Scanner;
import java.util.logging.Logger;
public class Main
{
    public static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        LOGGER.info("Enetr the X value:");
        int x = input.nextInt();
        LOGGER.info("Enter thr Y value:");
        int y = input.nextInt();
        LOGGER.info("Enetr the X1 value:");
        int x1 = input.nextInt();
        LOGGER.info("Enter thr Y1 value:");
        int y1 = input.nextInt();
        Coordinates coordinates = new Coordinates(x, y);
        Check check = new Check();
        String checkValue = String.valueOf(check.check(x, y, x1, y1));
        LOGGER.info(checkValue);
        Coordinates cloneObject = new Coordinates(coordinates);
        cloneObject.x = x1;
        cloneObject.y = y1;
        String original = "Orignial Coordinates of X and Y  is X:" + coordinates.x + " Y:" + coordinates.y;
        String cloneValue = "Cloned Coordinates of X and Y  is X:" + cloneObject.x + " Y:" + cloneObject.y;
        LOGGER.info(original);
        LOGGER.info(cloneValue);
    }
}