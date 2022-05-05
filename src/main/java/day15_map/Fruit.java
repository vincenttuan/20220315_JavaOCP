package day15_map;

public class Fruit {
    private String name;
    private int count;
    private double price;

    public Fruit(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }
    
    private Fruit(String name, String count, String price) {
        this.name = name;
        this.count = Integer.parseInt(count);
        this.price = Double.parseDouble(price);
    }
    
    public Fruit(String[] rows) {
        this(rows[0], rows[1], rows[2]);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", count=" + count + ", price=" + price + '}';
    }
    
}
