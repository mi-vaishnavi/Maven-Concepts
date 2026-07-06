package com.example;

public class Student {
    private String name;
    private int rollno;
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;

    public Student(String n, int r, int m, int s, int e){
        this.name = n;
        this.rollno = r;
        this.mathMarks = m;
        this.scienceMarks = s;
        this.englishMarks = e;
    }

    

    public String getName() {
        return name;
    }



    public int getRollno() {
        return rollno;
    }



    public int getMathMarks() {
        return mathMarks;
    }



    public int getScienceMarks() {
        return scienceMarks;
    }



    public int getEnglishMarks() {
        return englishMarks;
    }



    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + ", mathMarks=" + mathMarks + ", scienceMarks="
                + scienceMarks + ", englishMarks=" + englishMarks + "]";
    }

    
}
