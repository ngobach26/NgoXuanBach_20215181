import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0;

        // Ask user to input two double numbers
        while (true) {
            try {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input, please enter a valid number.");
            }
        }

        while (true) {
            try {
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input, please enter a valid number.");
            }
        }

        // Calculate the results

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        JOptionPane.showMessageDialog(null, "The sum is: " + sum);
        JOptionPane.showMessageDialog(null, "The difference is: " + diff);
        JOptionPane.showMessageDialog(null, "The product is: " + product);
        JOptionPane.showMessageDialog(null, "The quotient is: " + quotient);
    }
}
