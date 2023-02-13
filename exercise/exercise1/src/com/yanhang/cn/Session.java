package com.yanhang.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Session {
    List<Student> studentList = null;

    public Session() {
        studentList = new ArrayList<>();
    }

    // 平均
    public void average(List<Student> studentList, int num){
        int score = 0;
        for (Student student : studentList) {
            score += student.testScore[0];
            score += student.testScore[1];
        }
        System.out.println("The average test score of the whole class is: " + score / num);
    }

    public int[] sort(int[] testScore, int low, int high){

        if (low > high){
            return testScore;
        }
        int pivot = testScore[low];
        int l = low;
        int r = high;
        int temp = 0;
        while (l < r) {
            while (l < r && testScore[r] >= pivot) {
                r--;
            }
            while (l < r && testScore[l] <= pivot) {
                l++;
            }
            // 2.3 l指针还在r指针左侧，尚未相遇
            if (l < r) {
                temp = testScore[l];
                testScore[l] = testScore[r];
                testScore[r] = temp;
            }
        }
        testScore[low] = testScore[l];
        testScore[l] = pivot;

        if (low < l) {
            sort(testScore, low, l - 1);
        }
        if (r < high) {
            sort(testScore, r + 1, high);
        }
        return testScore;
    }

    public void printInfo(List<Student> studentList){
        for (Student student : studentList) {
           if (student.getType().equals("part")){
               System.out.print("[" + student.getName() + "]");
           }
        }
    }

    public void printScore(List<Student> studentList) throws Exception {
        System.out.println("\nFull-time student examination results: ");
        for (Student student : studentList) {
            if(student.getType().equals("full")){
                System.out.print("["+ student.getNums()[0] + ","+ student.getNums()[1]  +"]");
            }
        }
    }
}
