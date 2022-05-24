package com.itsol.model;

import java.util.Scanner;

public class Book {
    public static int ID = 1;

    private String id;

    private String nameBook;

    private String author;

    private String major;

    private int namSX;

    public Book(){

    }

    public Book(String major, String nameBook){
        this.major = major;
        this.nameBook = nameBook;
    }

    public Book(String nameBook, String author, String major, int namSX) {
        this.id = String.format("%05d", ID++);
        this.nameBook = nameBook;
        this.author = author;
        this.major = major;
        this.namSX = namSX;
    }

    public void nhapTT(){
        this.id = String.format("%05d", ID++);

        System.out.println("Nhập tên sách: ");
        this.nameBook = new Scanner(System.in).nextLine();

        System.out.println("Nhập tên tác giả: ");
        this.author = new Scanner(System.in).nextLine();

        System.out.println("Nhập chuyên ngành sách: ");
        int lua_Chon = new Scanner(System.in).nextInt();

        switch (lua_Chon){
                case 1:
                    this.major = Type_Book.NATURAL_SCIENCE.getTypeBook();
                    break;
                case 2:
                    this.major = Type_Book.ART_LITERATURE.getTypeBook();
                    break;
                case 3:
                    this.major = Type_Book.ELECTRONIC_TELECOMMUNICATION.getTypeBook();
                    break;
                case 4:
                    this.major = Type_Book.INFORMATION_TECHNOLOGY.getTypeBook();
                    break;
        }

        System.out.println("Nhập năm sản xuất của sách: ");
        this.namSX = new Scanner(System.in).nextInt();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", major='" + major + '\'' +
                ", namSX=" + namSX +
                '}';
    }
}
