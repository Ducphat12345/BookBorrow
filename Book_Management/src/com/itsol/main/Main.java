package com.itsol.main;
import com.itsol.service.Book_Service;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Book_Service book_service = new Book_Service();

        while (true){
            System.out.println("Mời bạn chọn chương trình:");
            System.out.println("1. Nhập, xuất danh sách các bạn đọc");
            System.out.println("2. Nhập, xuất danh sách các đầu sách");
            System.out.println("3. Quản lý bạn đọc mượn sách");
            System.out.println("4. Sắp xếp bạn đọc theo tên");
            System.out.println("5. Sắp xếp bạn đọc theo số lượng sách giảm dần");
            System.out.println("6. Tìm kiếm và hiển thị danh sách theo tên bạn đọc");
            System.out.println("7. Thoát");

            int lua_Chon = new Scanner(System.in).nextInt();

            switch (lua_Chon){

                case 1:
                    book_service.createNewReader();
                    book_service.displayReader();
                    break;
                case 2:
                    book_service.createNewBook();
                    book_service.displayBook();
                    break;
                case 3:
                    book_service.borrowBook();
                    break;
                case 4:
                    book_service.sortBorrowListByReaderName();
                    break;
                case 5:
                    book_service.sortBorrowListByBookAmount();
                    break;
                case 6:
                    book_service.searchAndDisplayPerson();
                    break;
                case 7:
                    System.out.println("Kết thúc chương trình!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có chương trình bạn chọn! Mời chọn lại:");
                    break;
            }
        }
    }


}
