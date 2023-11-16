
import java.lang.Math;

public class LinearEquation {

    /* Instance Variables */
   private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String b;
    private String m;

    /*returns the value toRound rounded to the nearest hundredth.  Used in every rounding instance in the program*/
    public double roundedToHundredth(double toRound) {

    return (double) (Math.round(toRound * 100)) /100;

    }

    /* Creates a LinearEquation object */
    public LinearEquation(int x1, int y1, int x2, int y2){

        this.x1 = x1;

        this.y1 = y1;

        this.x2 = x2;

        this.y2 = y2;
    }

    /* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
   the nearest hundredth */
    public double distance() {

        return roundedToHundredth(Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))));

    }

    /* Calculates and returns the y-intercept of the line between (x1, y1) and
   (x2, y2), rounded to the nearest hundredth */
    public double yIntercept() {

        return roundedToHundredth(y1 - x1 * ((double) (y2 - y1) / (x2 - x1)));

    }

    /* Calculates and returns the slope of the line between (x1, y1) and
   (x2, y2), rounded to the nearest hundredth */
    public double slope() {

        return roundedToHundredth((double) (y2 - y1) / (x2 - x1));

    }

    /* Returns a String that represents the linear equation of the line through points
   (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form*/
    public String equation(){



        if ( slope() == 1){

            m = "x ";

        }

        else if ( slope() == -1){

            m = "-x ";

        }

        else if ( slope() == 0){

            m = "";

        }

        else if (( slope() * 10) % 10 == 0) {
           m = String.valueOf((int)slope()) + "x ";
        }

        else if (0 + (y2 - y1) < 0 && 0 + (x2 - x1) < 0) {
            m = Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x ";
        }

        else if (0 + (y2 - y1) < 0 || 0 + (x2 - x1) < 0) {
            m = "-" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x ";
        }

        else {
            m = (y2 - y1) + "/" + (x2 - x1) + "x ";
        }




        if (yIntercept() == 0){

        b = "";

        }

        else if (yIntercept() > 0 && slope() == 0){

            b = "+ " + (int)yIntercept();

        }

        else if (yIntercept() > 0){

            b = "+ " + yIntercept();

        }

        else {

            b = String.valueOf(yIntercept());

        }

        return "y = " + m + b;

    }

    /* Returns a String of the coordinate point on the line that has the given x value, with
   both x and y coordinates as decimals to the nearest hundredth*/
    public String coordinateForX(double xValue){

        return "(" + roundedToHundredth(xValue) + ", " + roundedToHundredth(slope() * xValue + yIntercept()) + ")";

    }

    /* Returns a string that includes all information about the linear equation, each on
   separate lines:
     - The original points: (x1, y1) and (x2, y2)
     - The equation of the line in y = mx + b format (using equation() method)
     - The slope of the line, as a decimal (using slope() method)
     - The y-intercept of the line (using yIntercept() method)
     - The distance between the two points (using distance() method)*/
    public String lineInfo(){

        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n" +
                "The equation of the line between these points is: " + equation() +
                "\nThe slope of this line is: " + slope() +
                "\nThe y-intercept of the line is: " + yIntercept() +
                "\nThe distance between the two points is: " + distance();
    }










































}
