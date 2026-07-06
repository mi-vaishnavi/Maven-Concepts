package com.example;

public class GradeCalculator {
    public static double calculateAverage(Student std){
        return((std.getMathMarks() + 
               std.getScienceMarks() +
               std.getEnglishMarks())/3.0);
    }

    public static char calculateGrade(double avg){
        if(avg>=90) return 'A';
        else if(avg>=75) return 'B';
        else if(avg >= 60) return 'C';
        else return 'F';
    }
}
