public class Profile
{
    private String name;
    private String gender;
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
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    
    public void setName(boolean isMale)
    {
        if(isMale == true)
        {
            gender = "Male";
        }
        else
        {
            gender = "Female";
        }
    }
    
    public String getGender()
    {
        return gender;
    }
    
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public int getAge()
    {
        return age;
    }
    
    
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public int getHeight()
    {
        // return height all in inches for calculations
        // return height in feet and inches for display
        return height;
    }
    
    
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    
    public int getWeight()
    {
        return weight;
    }
}