package com.goodcode;

import java.util.ArrayList;
import java.util.List;

public  class SectionB implements Student,Classification,Percentage{
    static List<StudentDetails> studentDetailsList = new ArrayList<>();
    static List<int[]> marksList = new ArrayList<>();
    static int[] classPercent;
    static int numberOfSubjects;

    public static void main(String[] args){

        numberOfSubjects = 4;
        SectionB sectionB = new SectionB();
        sectionB.addStudents();
        sectionB.calculatePercent();

    }

    private  void addStudents() {
        studentDetailsList = addStudent("Avinash",18, new int[]{90, 80, 70,60},marksList);
        studentDetailsList = addStudent("raju",18, new int[]{90, 85, 77,100}, marksList);
    }

    public void calculatePercent(){
        PrintDetails printDetails = new PrintDetails();
        int[] classPercent = classPercentage(marksList, numberOfSubjects);
        printDetails.printStudentDetails(studentDetailsList,classPercent);
        int sum = 0;
        for(int i = 0;i<classPercent.length;i++){
            sum += classPercent[i];
        }
        SectionB school1 = new SectionB();
        school1.classifyStudent(sum/numberOfSubjects);
    }

    @Override
    public void classifyStudent(int classPercent) {
        marksList.get(0);
        int sum = 0;
        for(int i = 0;i<marksList.get(0).length;i++){
            sum += marksList.get(0)[i];
        }
        int percent = sum/3;
        if(percent > classPercent){
            System.out.println("good");
        }
        else{
            System.out.println("average");
        }
    }

    @Override
    public  List<StudentDetails> addStudent(String name, int age, int[] marks, List<int[]> marksList) {
        studentDetailsList.add(new StudentDetails(name,age,marks));
        marksList.add(marks);
        return studentDetailsList;
    }

    @Override
    public void deleteStudent(List<StudentDetails> studentDetailsList) {

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
        return classPercent;
    }
}
