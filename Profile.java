package finalproject;

public class Profile
{
    private String name;
    private String gender;
    private boolean isMale;
    private int age;
    private int height;
    private int feet;
    private int inches;
    private int weight;
    
    public Profile(String name, boolean isMale, int age, int feet, int inches, int weight)
    {
        this.name = name;
        
        if(isMale)
        {
            gender = "Male";
        }
        else
        {
            gender = "Female";
        }
        
        this.isMale = isMale;
        this.age = age;
        height = feet * 12 + inches;
        this.feet = feet;
        this.inches = inches;
        this.weight = weight;
    }
    
    public String toString()
    {
        String result = "";
        
        result += "Name: " + name + "\n";
        result += "Gender: " + gender + "\n";
        result += "Age: " + age + "\n";
        result += "Height: " + feet + "'" + inches + "\"" + "\n";
        result += "Weight: " + weight + " lbs" + "\n";
        
        return result;
    }
    
    public double calculateBMI()
    {
        //converts height and weight to metric
        double kg = weight*0.45;
        double meters = height*0.025;
        double constant = meters * meters;
        double bmi = kg/constant;
        return bmi;
    }
    
    public double calculateBMR()
    {
        if(isMale)
            return BMR.calculateBMRman(age, feet, inches, weight);
        else
            return BMR.calculateBMRwoman(age, feet, inches, weight);
    }
    

    
    public String getName()
    {
        return name;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public boolean getIsMale()
    {
        return isMale;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getHeight()
    {
        // return height all in inches for calculations
        // return height in feet and inches for display
        return height;
    }
    
    public int getWeight()
    {
        return weight;
    }
}