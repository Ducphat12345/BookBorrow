package com.itsol.model;

public enum Type_Book {
    NATURAL_SCIENCE("Khoa học tự nhiên"), ART_LITERATURE("Văn học - Nghệ thuật"), ELECTRONIC_TELECOMMUNICATION("Điện tử viễn thông"), INFORMATION_TECHNOLOGY("Công nghệ thông tin");

    private String typeBook;

    private Type_Book(String typeBook){
        this.typeBook = typeBook;
    }
    public String getTypeBook() {
        return typeBook;
    }
}
