/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
/**
 *
 * @author amerlin7
 */
public class Calculations extends Profile
{
    
    public double bodyFatPercentMan (int weight, double waistSize)
    {
        double leanBodyWeight=94.42+1.082*weight-4.15*waistSize;
        double bodyFatPercent=125-leanBodyWeight*(100/weight);
        return bodyFatPercent;
    }
    
    public double bodyFatPercentWomen (int weight, double wristDiameter, double forearmCircumference)
    {
        double wristDiameterCenti=wristDiameter/.394;
        double forearmCircumferenceCenti=forearmCircumference/.394;
        double weightKilo=weight/2.2;
        double leanBodyWeight=8.987+.732*weightKilo+3.786
            *wristDiameterCenti+.434*forearmCircumferenceCenti;
        double bodyFatPercent=weightKilo-leanBodyWeight*(100/weightKilo);
        return bodyFatPercent;
    }
    
    public double caloriesBurnedRunning(int weight, double distance)
    {
        double caloriesBurned=weight*.63*distance;
        return caloriesBurned;
    }
    
    public double caloriesBurnedWalking(int weight, double distance, double time)
    {
        double speed=distance/time;
        double caloriesBurned=0;
        double timeMinutes=time*60
        if(speed>5){
            caloriesBurned=.029*weight*timeMinutes;
        }
        else{
            caloriesBurned=.048*weight*timeMinutes;
        }
        return caloriesBurned;
    }
   public double caloriesBurnedBiking(int weight, double distance, double time)
   {
       double speed=distance/time
   }
    public void main (String[] args){
        
        System.out.println(calcBodyFatPercentMan(125, 30));
        System.out.println(calcBodyFatPercentWomen(125, 2, 5));
    }
}
