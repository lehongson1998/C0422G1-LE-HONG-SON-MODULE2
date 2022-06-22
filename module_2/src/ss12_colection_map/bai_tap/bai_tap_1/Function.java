package ss12_colection_map.bai_tap.bai_tap_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Function {
    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "iphone 13", 2021, "Apple", 1200));
        products.add(new Product(2, "Galaxy s22", 2021, "Samsung", 800));
        products.add(new Product(3, "Asus Zenfone 5", 2021, "Asus", 1700));
    }

    public void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter id:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("enter name:");
        String name = input.nextLine();
        System.out.println("enter releaseYear:");
        int releaseYear = Integer.parseInt(input.nextLine());
        System.out.println("enter produce:");
        String produce = input.nextLine();
        System.out.println("enter price:");
        int price = Integer.parseInt(input.nextLine());
        products.add(new Product(id, name, releaseYear, produce, price));
    }

    public void edit(int id) {
        for (Product s : products) {
            if (id == s.getId()) {
                Scanner input = new Scanner(System.in);
                System.out.println("enter name:");
                String name = input.nextLine();
                System.out.println("enter releaseYear:");
                int releaseYear = Integer.parseInt(input.nextLine());
                System.out.println("enter produce:");
                String produce = input.nextLine();
                System.out.println("enter price:");
                int price = Integer.parseInt(input.nextLine());
                s.setName(name);
                s.setProduce(produce);
                s.setReleaseYear(releaseYear);
                s.setPrice(price);
            }
        }
    }

    public void del(int id) {
        boolean flg = true;
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(products.get(i));
                flg = false;
            }
        }
        if (flg) {
            System.out.println("id have not!");
        }
    }

    public void display() {
        for (Product s : products) {
            System.out.println(s);
        }
    }

    public void find(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                System.out.println(products.get(i));
            }
        }
    }

    public void sort() {
        Collections.sort(products);
        display();
    }

    public void sortDecrease() {
        DecreasePrice decreasePrice = new DecreasePrice();
        Collections.sort(products, decreasePrice);
        display();
    }
}
