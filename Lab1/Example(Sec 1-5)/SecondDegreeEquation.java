
import javax.swing.JOptionPane;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        double a = getInputDouble("Enter the coefficient a:");
        while (a == 0) {
            a = getInputDouble("Invalid input: a cannot be zero.\nEnter the coefficient a:");
        }

        double b = getInputDouble("Enter the coefficient b:");
        double c = getInputDouble("Enter the coefficient c:");

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "The roots of the equation are x1 = " + x1 + " and x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "The equation has a double root x = " + x);
        } else {
            JOptionPane.showMessageDialog(null, "The equation has no real root.");
        }
    }

    private static double getInputDouble(String message) {
        double input;
        do {
            String inputString = JOptionPane.showInputDialog(message);
            try {
                input = Double.parseDouble(inputString);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input: please enter a valid decimal number.");
            }
        } while (true);
        return input;
    }
}
