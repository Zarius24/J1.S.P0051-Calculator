
import java.util.Scanner;

public class Validation {

    Scanner sc = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max) {
        int choice;
        while (true) {
            try {
                System.out.print("Please choose one option: ");
                choice = Integer.parseInt(sc.nextLine());
                if (choice < min || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range " + "[" + min + ", " + max + "]");
            }
        }
    }

    public double checkInputWeight() {
        double weight;
        while (true) {
            try {
                System.out.print("Enter Weight(kg): ");
                weight = Double.parseDouble(sc.nextLine());
                if (weight < 0) {
                    throw new NumberFormatException();
                }
                return weight;
            } catch (NumberFormatException e) {
                System.err.println("Weight must be digit greater than 0");
            }
        }
    }

    public double checkInputHeight() {
        double height;
        while (true) {
            try {
                System.out.print("Enter Height(cm): ");
                height = Double.parseDouble(sc.nextLine());
                if (height < 0) {
                    throw new NumberFormatException();
                }
                return height * 0.01;
            } catch (NumberFormatException e) {
                System.err.println("Height must be a digit greater than 0");
            }
        }
    }

    public String checkOperator() {
        String operator;
        while (true) {
            System.out.print("Enter operator: ");
            operator = sc.nextLine().trim();
            if (operator.equalsIgnoreCase("+") || operator.equalsIgnoreCase("-")
                    || operator.equalsIgnoreCase("*") || operator.equalsIgnoreCase("/")
                    || operator.equalsIgnoreCase("^") || operator.equalsIgnoreCase("=")) {
                return operator;
            } else {
                System.err.println("Please input (+, -, *, /, ^, =)");
            }
        }
    }

    public int checkInputDouble(String msg) {
        int n;
        while (true) {
            System.out.print(msg);
            try {
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Pleaese input a number");
            }
        }
    }
}
