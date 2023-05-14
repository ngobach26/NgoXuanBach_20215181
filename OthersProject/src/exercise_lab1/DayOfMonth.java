package exercise_lab1;
import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year, month, days;
        String monthName;
        

        while(true){
            System.out.println("Enter month and year: ");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            if(tokens.length != 2){
                System.out.println("Invalid input please try again!");
                continue;
            }

            monthName = tokens[0];
            month = getMonth(monthName);
            if(month == -1){
                System.out.println("Invalid month please try again");
                continue;
            }
            
            try{
                year = Integer.parseInt(tokens[1]);
                if(year < 0){
                    System.out.println("Invalid year please enter non-negative try again");
                    continue;
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid year please enter valid format try again");
                continue;
            }

            days = getDaysInMonth(month, year);

            System.out.println(monthName +" " + year + " have " + days +"days");
            break;
        }
        scanner.close();

    }
    public static int getMonth(String name) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            if (name.equalsIgnoreCase(months[i]) || name.equals(Integer.toString(i + 1)) 
            || name.equals(months[i].substring(0, 3)) || name.equalsIgnoreCase(months[i].substring(0, 3).concat("."))) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int getDaysInMonth(int month, int year) {
        int days;
        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }
        return days;
    }
}

