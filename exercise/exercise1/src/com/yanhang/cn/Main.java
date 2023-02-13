package com.yanhang.cn;

public class Main {
    public static void main(String[] args) throws Exception {
        Session session = new Session();
        for (int i = 0; i < 10; i++) {
            session.studentList.add(new PartTime("t_" + i, "stu_" + i, '0',"part", new int[]{90, 30, 100, 40, 29, 100, 80, 90, 75, 98}));
            session.studentList.add(new FullTime("qt_" + i, "stut_" + i, '1',new int[]{100, 75, 80, 93, 100, 68, 94, 83, 19, 99},"full",  new int[]{100, 99}));
        }
        session.average(session.studentList, 20);
        session.printInfo(session.studentList);
        session.printScore(session.studentList);
        System.out.println("List of test scores in ascending order");
        for (Student student : session.studentList) {
            int[] sort = session.sort(student.testScore, 0, student.testScore.length - 1);
            for (int i = 0; i < sort.length; i++){
                System.out.print(sort[i] + ",");
            }
            System.out.println();
        }
    }
}
