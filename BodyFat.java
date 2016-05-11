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
public class BodyFat extends Profile
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
    
    public double caloriesBurnedRunning(double BMRHour, double distance, double time)
    {
        double speed=distance/time;
        double caloriesBurned=0;
        if(speed>14){
            caloriesBurned=BMRHour*23;
        }
        else if(speed>13){
            caloriesBurned=BMRHour*19.8;
        }
        else if(speed>12){
            caloriesBurned=BMRHour*19;
        }
        else if(speed>11){
            caloriesBurned=BMRHour*16;
        }
        else if(speed>10){
            caloriesBurned=BMRHour*14.5;
        }
        else if(speed>9){
            caloriesBurned=BMRHour*12.8;
        }
        else if(speed>8){
            caloriesBurned=BMRHour*11.8;
        }
        else if(speed>7){
            caloriesBurned=BMRHour*11;
        }
        else{
            caloriesBurned=BMRHour*9.8;
        }
        return caloriesBurned*time;
    }
    
    public double caloriesBurnedWalking(double BMRHour, double distance, double time)
    {
       double caloriesBurned;
       double speed=distance/time;
       if(speed>5){
           caloriesBurned=BMRHour*8.3;
       }
       else if(speed>4.5){
           caloriesBurned=BMRHour*7;
       }
       else if(speed>4){
           caloriesBurned=BMRHour*5;
       }
       else if(speed>3.5){
           caloriesBurned=BMRHour*4.3;
       }
       else if(speed>2.8){
           caloriesBurned=BMRHour*3.5;
       }
       else if(speed>2.5){
           caloriesBurned=BMRHour*3;
       }
       else{
           caloriesBurned=BMRHour*2.8;
       }
       return caloriesBurned*time;
       //double speed=distance/time;
       //double caloriesBurned;
       //double timeMinutes=time*60;
       // if(speed>5){
       //     caloriesBurned=.029*weight*timeMinutes;
       // }
       // else{
       //     caloriesBurned=.048*weight*timeMinutes;
       // }
    }
   public double caloriesBurnedBiking(int BMRHour, double distance, double time)
   {
       double caloriesBurned;
       double speed=distance/time;
       if(speed>20){
           caloriesBurned=BMRHour*15.8;
       }
       else if(speed>16){
           caloriesBurned=BMRHour*12;
       }
       else if(speed>14){
           caloriesBurned=BMRHour*10;
       }
       else if(speed>12){
           caloriesBurned=BMRHour*8;
       }
       else if(speed>10){
           caloriesBurned=BMRHour*6.8;
       }
       else{
           caloriesBurned=BMRHour*3.5;
       }
       //double caloriesBurnedPerHour=(speed*weight*(.00000265)+.0083*(Math.pow(speed,3)* time)*7.2);
       //double caloriesBurned=caloriesBurnedPerHour*time;
       return caloriesBurned*time;
   }
   
   public double caloriesBurnedSwimming(int weight, double distance, double time)
   {
       double timeMinutes=time*60;
       double weightKilo=weight*.453592;
       double caloriesBurned=(timeMinutes*(6*3.5*weightKilo))/200;
       return caloriesBurned;
   
    }
}
