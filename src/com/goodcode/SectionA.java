package com.goodcode;

import java.util.ArrayList;
import java.util.List;

public class SectionA implements Student,Percentage{
    static List<StudentDetails> studentDetailsList = new ArrayList<>();
    static List<int[]> marksList;
    static int[] classPercent;

    public static void main(String[] args){

        // list Students with their marks in Subjects(Eng,Maths,Computers)
        // also implement functionalities like calculate average marks of the class per subject.
        // print students marks and class average marks.
        // calculate percentage of total marks
        // classify the student based on percentage


        marksList = new ArrayList<>();
        SectionA sectionA = new SectionA();
        sectionA.invoke(marksList,3);
        sectionA.deleteStudent(studentDetailsList);
    }

    private void invoke(List<int[]> marksList, int numberOfSubjects) {

        studentDetailsList = addStudent("Avinash",18, new int[]{90, 80, 70}, marksList);
        studentDetailsList = addStudent("raju",18, new int[]{90, 85, 77}, marksList);

        this.marksList = marksList;

        PrintDetails printDetails = new PrintDetails();
        int[] classPercent = classPercentage(marksList,numberOfSubjects);
        printDetails.printStudentDetails(studentDetailsList,classPercent);
        //

    }

    @Override
    public int[] classPercentage(List<int[]> marksList, int numberOfSubjects) {
        classPercent = new int[numberOfSubjects];
        int[] marks = new int[numberOfSubjects];
        for(int i = 0;i<marksList.size();i++){
            for(int j = 0; j< numberOfSubjects; j++){
                marks[j] += marksList.get(i)[j];
            }

        }
        for(int i = 0; i< numberOfSubjects; i++){
            classPercent[i] = marks[i]/marksList.size();
        }
        System.out.println(classPercent[0]);
        return classPercent;
    }


    @Override
    public List<StudentDetails> addStudent(String name, int age, int[] marks, List<int[]> marksList) {
        studentDetailsList.add(new StudentDetails(name,age,marks));
        marksList.add(marks);
        return studentDetailsList;
    }

    @Override
    public void deleteStudent(List<StudentDetails> studentDetailsList) {
        studentDetailsList.remove(0);
        PrintDetails printDetails = new PrintDetails();
        printDetails.printStudentDetails(studentDetailsList,classPercent);
    }
}

