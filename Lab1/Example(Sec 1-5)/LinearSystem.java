package NgoXuanBach_20215181.Lab1;
import javax.swing.JOptionPane;

public class LinearSystem {
    public static void main(String[] args) {
        double a11 = getInput("a11");
        double a12 = getInput("a12");
        double b1 = getInput("b1");
        double a21 = getInput("a21");
        double a22 = getInput("a22");
        double b2 = getInput("b2");

        double det = a11 * a22 - a21 * a12;

        if (det == 0) {
            if (b1 == b2) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            double x = (b1 * a22 - b2 * a12) / det;
            double y = (a11 * b2 - a21 * b1) / det;
            JOptionPane.showMessageDialog(null, "The solution of the system is (x, y) = (" + x + ", " + y + ")");
        }
    }

    private static double getInput(String variableName) {
        double value = 0;
        boolean validInput = false;
        do {
            try {
                value = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the coefficient " + variableName + " of the equation:"));
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid double value.");
            }
        } while (!validInput);
        return value;
    }
}
