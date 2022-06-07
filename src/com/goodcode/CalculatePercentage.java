package com.goodcode;

import java.util.List;

class CalculatePercentage{
    static int numberOfSubjects;
    static int[] classPercent;
    CalculatePercentage(int noOfSubjects){
        CalculatePercentage.numberOfSubjects = noOfSubjects;
    }
    public int[] ClassPercentage(List<int[]> marksList){


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

