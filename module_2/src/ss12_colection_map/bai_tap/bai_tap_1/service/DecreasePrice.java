package ss12_colection_map.bai_tap.bai_tap_1.service;

import ss12_colection_map.bai_tap.bai_tap_1.model.Product;

import java.util.Comparator;

public class DecreasePrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice()-o1.getPrice();
    }
}
