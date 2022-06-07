package com.goodcode;

import java.util.ArrayList;

// Liskov substitution

public class SectionC extends SectionA {

    public static void main(String[] args){
        marksList = new ArrayList<>();
        int noOfSubjects = 3;

        SectionC sectionC = new SectionC();

        sectionC.addStudents();
        PrintDetails printDetails = new PrintDetails();
        CalculatePercentage calculatePercentage = new CalculatePercentage(noOfSubjects);
        int[] classPercent = calculatePercentage.ClassPercentage(marksList);
        printDetails.printStudentDetails(studentDetailsList,classPercent);
    }

    private  void addStudents() {
        studentDetailsList = addStudent("Avinash",18, new int[]{90, 80, 70}, marksList);
    }
}
