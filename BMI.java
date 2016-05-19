
/**
 * Write a description of class BMI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BMI
{
    //calculate your body mass index
    public double bmi(int feet, int inches, int weight)
    {
        //converts height and weight to metric
        double kg = weight*0.45;
        double meters = (feet*12 + inches)*0.025;
        double constant = meters * meters;
        double bmi = weight/constant;
        return bmi;
    }
    
}
