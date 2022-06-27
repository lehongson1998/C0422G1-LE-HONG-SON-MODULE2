package ss12_colection_map.bai_tap.bai_tap_1.controller;

import ss12_colection_map.bai_tap.bai_tap_1.service.Function;

import java.util.Scanner;

public class ProductManager {
    public static void displayMain(){
        Function product = new Function();
        Scanner snc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add new product.\n2.Edit Product.\n3.Delete product.\n4.Display product.\n5.Find product.\n6.Sort product.");
            choice = Integer.parseInt(snc.nextLine());
            switch (choice) {
                case 1:
                    product.addProduct();
                    product.display();
                    break;
                case 2:
                    System.out.println("enter id want edit:");
                    int id = Integer.parseInt(snc.nextLine());
                    product.edit(id);
                    break;
                case 3:
                    System.out.println("enter id want delete:");
                    int id1 = Integer.parseInt(snc.nextLine());
                    product.del(id1);
                    break;
                case 4:
                    product.display();
                    break;
                case 5:
                    System.out.println("enter id want find:");
                    int id2 = Integer.parseInt(snc.nextLine());
                    product.find(id2);
                    break;
                case 6:
                    System.out.println("1.prices increase gradually.\n2.prices decrease gradually.\nEnter number:");
                    int i = Integer.parseInt(snc.nextLine());
                    if (i == 1)
                        product.sort();
                    if (i == 2)
                        product.sortDecrease();
                    else{
                        break;
                    }
                    break;
                default:
                    break;
            }
        } while (choice <= 6);
    }
}
