
public class NormalCalculator {

    Validation v = new Validation();

    public void Calculate() {
        int memory;
        String operator;
        memory = v.checkInputDouble("Enter Number: ");
        while (true) {
            operator = v.checkOperator();
            if (operator.equalsIgnoreCase("+")) {
                memory += v.checkInputDouble("Enter Number: ");
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("-")) {
                memory -= v.checkInputDouble("Enter Number: ");
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("*")) {
                memory *= v.checkInputDouble("Enter Number: ");
                System.out.println("Memory: " + memory);
            }
            //
            if (operator.equalsIgnoreCase("/")) {
                try{
                    memory /= v.checkInputDouble("Enter Number: ");
                    System.out.println("Memory: " + (double)memory);
                }catch (ArithmeticException e){
                    System.err.println("Can't divide by zero");
                }
                }
            //
            if (operator.equalsIgnoreCase("^")) {
                memory = (int) Math.pow(memory, v.checkInputDouble("Enter Number: "));
                System.out.println("Memory: " + (double)memory);
            }
            //
            if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                break;
            }
        }
    }
}
