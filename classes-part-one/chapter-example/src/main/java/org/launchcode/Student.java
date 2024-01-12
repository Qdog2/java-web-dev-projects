package org.launchcode;

import java.util.Scanner;
public class Student {
    Scanner input = new Scanner(System.in);

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredit;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredit, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredit = numberOfCredit;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
        Student person = new Student("Violet");
        System.out.println(person.toString());
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + "has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
       //Update the appropriate fields: numberOfCredits, gpa
        double totalQualityScore = this.gpa * this.numberOfCredit;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredit += courseCredits;
        this.gpa = totalQualityScore/this.numberOfCredit;
    }
    public String getName() {
        this.name = name;
        return name;
    }

    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public double getGpa() {
        return gpa;
    }
    public String toString() {
        String studentReport = String.format("% is a %s with %d credits and a GPS of %.2f", this.name, this.getGradeLevel(this.numberOfCredit), this.getNumberOfCredit(), this.getGpa());
        return studentReport;
    }

    public int getStudentId() {
        this.studentId = studentId;
        return studentId;
    }

    //public String toString() {
        //return name + " (Credits: " + numberOfCredit + ", GPA: " + gpa + ")";
    //
//}

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if(toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

    public static void main(String[] args) {
        Student bono1 = new Student("Paul David Hewson", 4);
        Student bono2 = new Student("Bono", 4);

        if (bono1.equals(bono2)) {
            System.out.println(bono1.getName() +
                    " is the same as " + bono2.getName());
        }
    }

    //1) method argument cannot be converted to a Student instance
    public boolean equals(Object toBeCompared) {

        if (toBeCompared.getClass() != getClass()) {
            return false;
        } //this prevents any object other than the student object to get passed into equals, ensures that the objects we
        // want to compare came from the same class

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }


    //2) toBeCompared might be null

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == null) {
            return false;
        } //checks toBeCompared for null, preventing an error in line 7

        if (toBeCompared.getClass() != getClass()) {
            return false;
        } //checks the class of toBeCompared preventing an error in line 11

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

    //3 the two objects to compare are the same object(identical)
    public boolean equals(Object toBeCompared) {

        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

    //reference check: if the two objects are the same, return true right away
    //null check: if the argument is null, then return false
    //class check: compare the classes of the two object to ensure a safe cast. Return false if the classes are different.
    //cast: convert the argument to the type of our class, so getters and other methods can be called
    //custom comparison: use custom logic to determine if the two objects should be considered equal. This will usually be a comparison of properties or fields.
    public static String getGradeLevel(int credits) {
        if (credits <= 29){
            return "freshman";
        } else if (credits <= 59) {
            return "sophomore";
        } else if (credits <= 89) {
            return "junior";
        } else {
            return "senior";
        }
    }




    /*getters and setters omitted*/
}


