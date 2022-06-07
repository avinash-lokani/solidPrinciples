package com.badcode;

import com.goodcode.StudentDetails;


import java.util.ArrayList;
import java.util.List;

public class SectionA implements Classification{
    static List<StudentDetails> detailsList = new ArrayList<>();
    static List<int[]> marksList = new ArrayList<>();
    static int[] classPercent;
    static int noOfSubjects = 3;

    public static List<StudentDetails> addStudent(String name, int age, int[] marks, List<int[]> marksList){
        detailsList.add(new StudentDetails(name,age,marks));
        marksList.add(marks);
        return detailsList;
    }
    public static void main(String[] args){
        marksList = new ArrayList<>();


        detailsList = addStudent("Avinash",18, new int[]{90, 80, 70}, marksList);
        detailsList = addStudent("raju",18, new int[]{90, 85, 77}, marksList);

        if(detailsList.size() > 0){
            for(int i = 0;i<detailsList.size();i++){
                System.out.println(detailsList.get(i));
            }
        }

        SectionA sectionA = new SectionA();

        //CalculatePercentage calculatePercentage = new CalculatePercentage(noOfSubjects);
        int[] classPercent = sectionA.classPercentage(marksList,noOfSubjects);

        System.out.println("class Average");
        for(int i = 0;i<classPercent.length;i++){
            System.out.println("Subject"+(i+1) +" ="+classPercent[i]);
        }

        deleteStudent(detailsList);
        if(detailsList.size() > 0){
            for(int i = 0;i<detailsList.size();i++){
                System.out.println(detailsList.get(i));
            }
        }
        int sum = 0;
        for(int i = 0;i<classPercent.length;i++){
            sum += classPercent[i];
        }
        sectionA.classifyStudent(sum/3);
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

    @Override
    public void classifyStudent(int classP) {
        marksList.get(0);
        int sum = 0;
        for(int i = 0;i<marksList.get(0).length;i++){
            sum += marksList.get(0)[i];
        }
        int percent = sum/3;
        if(percent > classP){
            System.out.println("good");
        }
        else{
            System.out.println("average");
        }
    }

    public static void deleteStudent(List<StudentDetails> detailsList){
        detailsList.remove(0);
    }
}
