package com.goodcode;


// single Responsibility

public class StudentDetails {
    int age;
    String name;
    int[] marksList;

    public StudentDetails(String name, int age, int[] marksList){
        this.marksList = marksList;
        this.age = age;
        this.name = name;

    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0;i<marksList.length;i++){
            s += marksList[i]+" ,";
        }
        s = s.substring(0,s.length()-2);
        return "Student name = "+ name+" age = "+age+" marks = ["+s+"]";
    }
}

