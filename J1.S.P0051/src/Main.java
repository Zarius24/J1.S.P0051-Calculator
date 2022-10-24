
public class Main {

    public static void main(String[] args) {
        Validation v = new Validation();
        BMICalculator bmiCal = new BMICalculator();
        NormalCalculator cal = new NormalCalculator();
        int choice;
        double bmi;
        while(true){
            System.out.println("========= Calculator Program =========");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            choice = v.checkInputIntLimit(1, 3);
            switch (choice){
                case 1:
                    cal.Calculate();
                    break;
                case 2:
                    bmi = bmiCal.BMIInput();
                    System.out.println("BMI Status: " + bmiCal.BMICheck(bmi));
                    break;
                case 3:
                    System.out.println("Thanks for using the program!");
                    return;
            }
            
            
            
        }
    }
    
}
