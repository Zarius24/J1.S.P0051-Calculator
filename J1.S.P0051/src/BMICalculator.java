public class BMICalculator {

    Validation v = new Validation();
    public double BMIInput() {
        System.out.println("----- BMI Calculator -----");
        double weight = v.checkInputWeight();
        double height = v.checkInputHeight();
        return weight / (height * height);
    }
    
    public String BMICheck(double BMI){
        System.out.printf("BMI Number: %.2f \n", BMI);
        if(BMI <= 19) return "Under-standard"; 
        if(BMI <= 25) return "Standard"; 
        if(BMI <= 30) return "Overweight"; 
        if(BMI <= 40) return "Fat - should lose weight"; 
        else return "Very fat- should lose weight immediately"; 
    }
    
}
