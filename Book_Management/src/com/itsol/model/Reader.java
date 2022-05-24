package com.itsol.model;

import java.util.Scanner;

public class Reader extends Person {
    public static int ID = 1;

    private String id;

    private String typeReader;

    public Reader(){

    }

    public Reader(String name, String address, int phone, String typeReader){
        super(name, address, phone);
        this.id = String.format("%05d", ID++);
        this.typeReader = typeReader;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeReader() {
        return typeReader;
    }

    public void setTypeReader(String typeReader) {
        this.typeReader = typeReader;
    }

    public void nhapTT(){
        this.id = String.format("%05d", ID++);

        super.nhapTT();

        System.out.println("Nhập loại bạn đọc: ");
        int lua_Chon = new Scanner(System.in).nextInt();

        switch (lua_Chon){
            case 1:
                this.typeReader = Type_Person.Student.getType_Person();
                break;
            case 2:
                this.typeReader = Type_Person.Graduate.getType_Person();
                break;
            case 3:
                this.typeReader = Type_Person.Teacher.getType_Person();
                break;
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", ReaderType='" + typeReader + '\'' +
                '}';
    }

}
