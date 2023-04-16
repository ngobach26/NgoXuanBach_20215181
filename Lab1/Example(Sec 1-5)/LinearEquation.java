import javax.swing.JOptionPane;

public class LinearEquation {
    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        String strnum1, strnum2;
        Double a,b;

        do{
            strnum1 = JOptionPane.showInputDialog(null, "Enter a", "Enter coefficient of ax + b =0", 0);
        }while (!isDouble(strnum1));

        do {
            strnum2 = JOptionPane.showInputDialog(null, "Enter b", "Enter coefficient of ax + b =0", 0);
        }while (!isDouble(strnum2));
        
        a = Double.parseDouble(strnum1);
        b = Double.parseDouble(strnum2);

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "Have infinite number of solution", "Result", 0);
            } else {
                JOptionPane.showMessageDialog(null, "Have no solution", "Result", 0);
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is: " + x, "Result", 0);
        }
        
    }
}
