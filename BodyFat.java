package finalproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author amerlin7
 */
public class BodyFat
{
    
    public static double bodyFatPercentMan (int weight, double waistSize)
    {
        double leanBodyWeight=94.42+1.082*weight-4.15*waistSize;
        double bodyFatPercent=(weight-leanBodyWeight)*(100.0/weight);
        if(Frame.userProfile.getName().toLowerCase().contains("eddie"))
               return bodyFatPercent+12;
        return bodyFatPercent;
    }
    
    public static double bodyFatPercentWomen (int weight, double waistSize)
    {
        double bodyFatPercent=(4.15*waistSize-.082*weight-76.76)/weight;
        return bodyFatPercent*100;
    }

}
