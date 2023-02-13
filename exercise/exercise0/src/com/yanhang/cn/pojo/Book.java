package com.yanhang.cn.pojo;

public class Book {
    int id;
    String name;
    String author;
    String bookType;
    String publicationNo;
    String reportNo;
    String patentNo;
    String generalChapter;

    public Book(int id, String name, String author, String bookType, String publicationNo, String reportNo, String patentNo, String generalChapter) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.bookType = bookType;
        this.publicationNo = publicationNo;
        this.reportNo = reportNo;
        this.patentNo = patentNo;
        this.generalChapter = generalChapter;
        System.out.println("id => " + id + " name =>" + name);
    }

    public void turnPage(){}

    public void bookInfo(){}

    public void lookBook(){}
}
