package com.badcode;

import com.goodcode.StudentDetails;

import java.util.ArrayList;
import java.util.List;

public class SectionB extends SectionA {
    static List<StudentDetails> detailsList = new ArrayList<>();
    static List<int[]> marksList = new ArrayList<>();
    static int[] classPercent;
    static int noOfSubjects = 3;

    public static List<StudentDetails> addStudent(String name, int age, int[] marks, List<int[]> marksList, String CLASS){
        detailsList.add(new StudentDetails(name,age,marks));
        marksList.add(marks);
        return detailsList;
    }
    public static void main(String[] args){
        marksList = new ArrayList<>();
        String CLASS = "X";

        detailsList = addStudent("Avinash",18, new int[]{90, 80, 70}, marksList,CLASS);
        detailsList = addStudent("raju",18, new int[]{90, 85, 77}, marksList,CLASS);

        if(detailsList.size() > 0){
            for(int i = 0;i<detailsList.size();i++){
                System.out.println(detailsList.get(i));
            }
        }

        SectionB sectionB = new SectionB();

        //CalculatePercentage calculatePercentage = new CalculatePercentage(noOfSubjects);
        int[] classPercent = sectionB.classPercentage(marksList,noOfSubjects);

        System.out.println("class Average");
        for(int i = 0;i<classPercent.length;i++){
            System.out.println("Subject"+(i+1) +" ="+classPercent[i]);
        }

        DeleteStudent(detailsList);
        if(detailsList.size() > 0){
            for(int i = 0;i<detailsList.size();i++){
                System.out.println(detailsList.get(i));
            }
        }

    }
    public int[] classPercentage(List<int[]> marksList, int noOfSubjects) {
        classPercent = new int[noOfSubjects];
        int[] marks = new int[noOfSubjects];
        for(int i = 0;i<marksList.size();i++){
            for(int j = 0;j<noOfSubjects;j++){
                marks[j] += marksList.get(i)[j];
            }

        }
        for(int i = 0;i<noOfSubjects;i++){
            classPercent[i] = marks[i]/marksList.size();
        }
        System.out.println(classPercent[0]);
        return classPercent;
    }


    public static void DeleteStudent(List<StudentDetails> detailsList){
        detailsList.remove(0);
    }
}
