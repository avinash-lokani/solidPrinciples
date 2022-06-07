package com.goodcode;

import java.util.List;


class PrintDetails {
    public void printStudentDetails(List<StudentDetails> detailsList, int[] classPercent){
        if(detailsList.size() > 0){
            for(int i = 0;i<detailsList.size();i++){
                System.out.println(detailsList.get(i));
            }
        }
        System.out.println("class Average");
        for(int i = 0;i<classPercent.length;i++){
            System.out.println("Subject"+(i+1) +" ="+classPercent[i]);
        }
    }
}

