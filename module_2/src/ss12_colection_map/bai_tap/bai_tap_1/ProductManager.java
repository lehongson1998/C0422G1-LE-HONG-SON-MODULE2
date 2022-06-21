package ss12_colection_map.bai_tap.bai_tap_1;

import java.util.Scanner;

import static ss12_colection_map.bai_tap.bai_tap_1.Function.products;

public class ProductManager {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add new product.\n2.Edit Product.\n3.Delete product.\n4.Display product.\n5.Find product.\n6.Sort product.");
            choice = Integer.parseInt(snc.nextLine());
            switch (choice) {
                case 1:
                    products.add(Function.addProduct());
                    Function.display();
                    break;
                case 2:
                    System.out.println("enter id want edit:");
                    int id = Integer.parseInt(snc.nextLine());
                    Function.edit(id);
                    break;
                case 3:
                    System.out.println("enter id want delete:");
                    int id1 = Integer.parseInt(snc.nextLine());
                    Function.del(id1);
                    break;
                case 4:
                    Function.display();
                    break;
                case 5:
                    System.out.println("enter id want find:");
                    int id2 = Integer.parseInt(snc.nextLine());
                    Function.find(id2);
                    break;
                case 6:
                    System.out.println("1.prices increase gradually.\n2.prices decrease gradually.\nEnter number:");
                    int i = Integer.parseInt(snc.nextLine());
                    if (i == 1)
                        Function.sort();
                    if (i == 2)
                        Function.sortDecrease();
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
