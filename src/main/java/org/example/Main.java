package org.example;
import java.util.Scanner;
import java.util.logging.Logger;
class Coordinates implements Cloneable
{
    int x,y;

     Coordinates(int x,int y)
     {
         this.x=x;
         this.y=y;
     }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class Check
{

   boolean check(int x,int y,int x1,int y1)
   {
       return x==x1 && y==y1;
   }

}
public class Main
{
    public static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    public static void main(String[] args)  throws CloneNotSupportedException
    {
        Scanner input=new Scanner(System.in);
        LOGGER.info("Enetr the X value:");
        int x=input.nextInt();
        LOGGER.info("Enter thr Y value:");
        int y=input.nextInt();
        LOGGER.info("Enetr the X1 value:");
        int x1=input.nextInt();
        LOGGER.info("Enter thr Y1 value:");
        int y1=input.nextInt();
        Coordinates coordinates=new Coordinates(x,y);
        Check check=new Check();
        LOGGER.info(String.valueOf(check.check(x,y,x1,y1)));
        Coordinates cloneObject=(Coordinates)coordinates.clone();
        cloneObject.x=x1;
        cloneObject.y=y1;
        LOGGER.info("Orignial Coordinates of X and Y  is X value:"+coordinates.x+" Y Value:"+coordinates.y);
        LOGGER.info("Cloned Coordinates of X and Y  is X value:"+cloneObject.x+" Y Value:"+cloneObject.y);
        



    }
}