package com.itsol.model;

public enum Type_Person {
    Student("Sinh Viên"), Graduate("Học Viên Cao Học"), Teacher("Giáo Viên");

    private String type_Person;

    private Type_Person(String type_Person){
        this.type_Person = type_Person;
    }
    public String getType_Person() {
        return type_Person;
    }
}
