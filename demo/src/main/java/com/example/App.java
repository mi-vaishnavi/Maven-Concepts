package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
   public static void main(String[] args) {
    Student stud = new Student("Vaishnavi", 87, 98, 95, 91);
   
    ReportCalculator.generateReport(stud);
     
   }
    
}
