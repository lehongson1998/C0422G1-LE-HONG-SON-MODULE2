package ss12_colection_map.bai_tap.bai_tap_1.model;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int releaseYear;
    private String produce;
    private int price;

    public Product() {
    }

    public Product(int id,String name, int releaseYear, String produce, int price) {
        this.id = id;
        this.name = name;
        this.releaseYear = releaseYear;
        this.produce = produce;
        this.price = price;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return  this.getPrice()-o.getPrice();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", produce='" + produce + '\'' +
                ", price=" + price +
                '}';
    }
}
