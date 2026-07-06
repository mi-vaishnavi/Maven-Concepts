package com.example;

public class ReportCalculator {
    public static void generateReport(Student std){
        System.out.println("Name: " + std.getName()+
                        " RollNo:" + std.getRollno());
        System.out.println("-----Marks Report-----"); 
        System.out.println("Math Marks: "+ std.getMathMarks());   
        System.out.println("Science Marks: "+ std.getScienceMarks());   
        System.out.println("English Marks: "+ std.getEnglishMarks()); 
        double avg = GradeCalculator.calculateAverage(std);
        System.out.println("Average :" + avg); 
        System.out.println("Grade: "+GradeCalculator.calculateGrade(avg));
    }
}
