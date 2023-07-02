//Name: ONUOHA PHILIP OGBONNA
//Reg.No: 20201211152
//Department: INFORMATION TECHNOLOGY
//BATCH A

//A Program that find the roots of Quadratic Equation

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        // Step 2: Declare and initialize variables
        double x1, x2, R, a, b, c;

        // Step 4: Input parameters a, b, c
        a = 6;
        b = -7;
        c = 1;

        // Step 5: Calculate R = b^2 - 4ac
        R = b * b - 4 * a * c;

        // Step 6: Check the value of R
        if (R > 0) {
            // Step 7: Calculate the roots and print
            x1 = (-b + Math.sqrt(R)) / (2 * a);
            x2 = (-b - Math.sqrt(R)) / (2 * a);
            System.out.println("Two real and different roots exist.");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (R == 0) {
            // Step 8: Print the one real root
            x1 = -b / (2 * a);
            System.out.println("One real root exists.");
            System.out.println("x = " + x1);
        } else {
            // Step 9: Print no real roots
            System.out.println("No real roots exist.");
        }

        // Step 10: End
    }
}

