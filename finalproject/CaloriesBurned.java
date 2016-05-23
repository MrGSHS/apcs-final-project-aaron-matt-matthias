package src.finalproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amerlin7
 */
public class CaloriesBurned {

    public static double caloriesBurnedRunning(double BMRHour, double distance, double time) {
        double speed = distance / time;
        double caloriesBurned = 0;
        if (speed > 14) {
            caloriesBurned = BMRHour * 23;
        } else if (speed > 13) {
            caloriesBurned = BMRHour * 19.8;
        } else if (speed > 12) {
            caloriesBurned = BMRHour * 19;
        } else if (speed > 11) {
            caloriesBurned = BMRHour * 16;
        } else if (speed > 10) {
            caloriesBurned = BMRHour * 14.5;
        } else if (speed > 9) {
            caloriesBurned = BMRHour * 12.8;
        } else if (speed > 8) {
            caloriesBurned = BMRHour * 11.8;
        } else if (speed > 7) {
            caloriesBurned = BMRHour * 11;
        } else {
            caloriesBurned = BMRHour * 9.8;
        }
        return caloriesBurned * time;
    }

    public static double caloriesBurnedWalking(double BMRHour, double distance, double time) {
        double caloriesBurned;
        double speed = distance / time;
        if (speed > 5) {
            caloriesBurned = BMRHour * 8.3;
        } else if (speed > 4.5) {
            caloriesBurned = BMRHour * 7;
        } else if (speed > 4) {
            caloriesBurned = BMRHour * 5;
        } else if (speed > 3.5) {
            caloriesBurned = BMRHour * 4.3;
        } else if (speed > 2.8) {
            caloriesBurned = BMRHour * 3.5;
        } else if (speed > 2.5) {
            caloriesBurned = BMRHour * 3;
        } else {
            caloriesBurned = BMRHour * 2.8;
        }
        return caloriesBurned * time;
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

    public static double caloriesBurnedBiking(int BMRHour, double distance, double time) {
        double caloriesBurned;
        double speed = distance / time;
        if (speed > 20) {
            caloriesBurned = BMRHour * 15.8;
        } else if (speed > 16) {
            caloriesBurned = BMRHour * 12;
        } else if (speed > 14) {
            caloriesBurned = BMRHour * 10;
        } else if (speed > 12) {
            caloriesBurned = BMRHour * 8;
        } else if (speed > 10) {
            caloriesBurned = BMRHour * 6.8;
        } else {
            caloriesBurned = BMRHour * 3.5;
        }
        //double caloriesBurnedPerHour=(speed*weight*(.00000265)+.0083*(Math.pow(speed,3)* time)*7.2);
        //double caloriesBurned=caloriesBurnedPerHour*time;
        return caloriesBurned * time;
    }

    public static double caloriesBurnedSwimming(double BMRHour, double distance, double time) {
        double caloriesBurned;
        double speed = distance / time;
        if (speed > 2.5) {
            caloriesBurned = BMRHour * 10;
        } else if (speed > 1.7) {
            caloriesBurned = BMRHour * 8.3;
        } else {
            caloriesBurned = BMRHour * 6;
        }
        //double timeMinutes=time*60;
        //double weightKilo=weight*.453592;
        //double caloriesBurned=(timeMinutes*(6*3.5*weightKilo))/200;
        return caloriesBurned * time;
    }

    public static double caloriesBurnedSkiing(double BMRHour, double time) {
        double caloriesBurned = BMRHour * 7;
        return caloriesBurned * time;
    }

    public static double caloriesBurnedSoccer(double BMRHour, double time) {
        double caloriesBurned = BMRHour * 7;
        return caloriesBurned * time;
    }

    public static double caloriesBurnedTennis(double BMRHour, double time) {
        double caloriesBurned = BMRHour * 7.3;
        return caloriesBurned * time;
    }

    public static double caloriesBurnedBasketball(double BMRHour, double time) {
        double caloriesBurned = BMRHour * 8;
        return caloriesBurned * time;
    }

    public static double caloriesBurnedFootball(double BMRHour, double time) {
        double caloriesBurned = BMRHour * 8;
        return caloriesBurned * time;
    }

    public static double caloriesBurnedVolleyball(double BMRHour, double time) {
        double caloriesBurned = BMRHour * 4;
        return caloriesBurned * time;
    }

}
