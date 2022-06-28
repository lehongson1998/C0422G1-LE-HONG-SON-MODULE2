package ss17_binary_file_serialization.bai_tap.bai_tap_1.service;

import ss17_binary_file_serialization.bai_tap.bai_tap_1.model.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void write(List<Products> productsList){
        final String LINK = "src/ss17_binary_file_serialization/bai_tap/bai_tap_1/service/products.dat";
        try {
            FileOutputStream fos = new FileOutputStream(LINK);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productsList);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Products> read(){
        final String LINK = "src/ss17_binary_file_serialization/bai_tap/bai_tap_1/service/products.dat";
        List<Products> productsList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(LINK);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productsList = (List<Products>)ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productsList;
    }
}
