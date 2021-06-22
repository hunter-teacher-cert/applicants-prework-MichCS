import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
   
int hour = 13;
int minute = 8;
int second = 03;

System.out.println("The amount of seconds that have passed since midnight:" + " " + ((hour * 60)*60) + " " + "seconds");
System.out.println();
System.out.println("The amount of seconds that remain in the day:" + " " + (((24 - hour)*60)*60) +  " " + "seconds");
System.out.println();

		double Hour = 13.0;
		double percentage = ((hour/24.0)*100);
		int CurrentHour = 13;
		int CurrentMinute = 45;
		int CurrentSecond = 05;
		
		
		
		System.out.println("The amount of seconds that have passed since midnight:" + " " + ((hour * 60)*60) + " " + "seconds");
    System.out.println();
		System.out.println("The amount of seconds that remain in the day:" + " " + (((24 - hour)*60)*60) +  " " + "seconds"); 
    System.out.println();
		System.out.println("The percentage of the day that has passed: " + percentage + "%");
    System.out.println();
		System.out.println("The elapsed time since working on this exercise: " + (CurrentHour - Hour) + ":" + (CurrentMinute - minute) + ":" + (CurrentSecond - second)); 
		
		
    }
}

