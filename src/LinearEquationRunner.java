import java.util.Scanner;
public class LinearEquationRunner {
    static void Start() {
        System.out.println("Welcome!");
    }
    public static void main(String[] args) {

        int x1;
        int y1;
        int x2;
        int y2;


        Start();

/*Asks the user for coordinates and stores them*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter coordinate 1: ");
        String cor1 = scan.nextLine();
        System.out.println("Please enter coordinate 2: ");
        String cor2 = scan.nextLine();
        System.out.println();



/*extracts numbers from the coordinates that the user provided*/
        x1 = Integer.parseInt(cor1.substring(1, cor1.indexOf(",")));

        y1 = Integer.parseInt(cor1.substring(cor1.indexOf(",")+ 2, cor1.length()-1));

        x2 = Integer.parseInt(cor2.substring(1, cor2.indexOf(",")));

        y2 = Integer.parseInt(cor2.substring(cor2.indexOf(",")+ 2, cor2.length()-1));


        /*Ensures that the program does not have to calculate vertical lines by giving the user the equation and stopping the program*/
        if (x1 == x2){
            System.out.println("These points are on a vertical line: x = " + x1);
            System. exit(0);
        }

        /*Creates the LinearEquation object with the parsed out user coordinates as arguments*/
        LinearEquation LinearEquation= new LinearEquation(x1, y1, x2, y2);

        /*Prints all the info about the line that resulted from the user's coordinates*/
        System.out.println(LinearEquation.lineInfo());
        System.out.println();

        /*Asks the user for an x value to find the y value associated with it on the line that resulted from the user's coordinates*/
        System.out.println("Please enter a value for x: ");
        System.out.println();

        double xVal = Double.parseDouble(scan.nextLine());
        System.out.println(LinearEquation.coordinateForX(xVal));





    }


}





























