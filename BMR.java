//calories that body should intake

public class BMR
{
   
    
    public double calculateBMRman(String name, boolean isMale, int age, int feet, int inches, int weight)
    {
        double kg = 0.453592*weight;
        double height = (feet*12 + inches)* 2.54;
        double bmr = 10*kg + 6.25* height - 5*age +5;
        
        return bmr;
        
    }
    
     public double calculateBMRwoman(String name, boolean isMale, int age, int feet, int inches, int weight)
    {
        double kg = 0.453592*weight;
        double height = (feet*12 + inches)* 2.54;
        double bmr = 10*kg + 6.25* height - 5*age -161;
        
        return bmr;
        
    }

 
}
