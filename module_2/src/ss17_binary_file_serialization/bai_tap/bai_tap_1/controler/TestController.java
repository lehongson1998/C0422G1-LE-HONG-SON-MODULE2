package ss17_binary_file_serialization.bai_tap.bai_tap_1.controler;

import ss17_binary_file_serialization.bai_tap.bai_tap_1.service.ProductManger;

import java.util.Scanner;

public class TestController {
    ProductManger productManger = new ProductManger();
    public void display2(){
        Scanner snc = new Scanner(System.in);
        int choice;
        boolean flag = true;
        do {
            System.out.println("Menu sản phẩm.\n1.thêm sản phẩm.\n2.xóa sản phẩm.\n3.tìm kiếm sản phẩm.\n4.hiển thị sản phẩm.\n5.thoát.");
            System.out.println("chọn chức năng:");
            choice = snc.nextInt();
            switch (choice){
                case 1:
                    productManger.add();
                    break;
                case 2:
                    productManger.remove();
                    break;
                case 3:
                    productManger.find();
                    break;
                case 4:
                    productManger.display();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("vui lòng chọn lại");
            }

        }while (flag);
    }
}
