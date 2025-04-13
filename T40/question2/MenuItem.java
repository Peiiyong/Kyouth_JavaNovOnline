package question2;

public class MenuItem {
    int id;
    String name;
    double price;
    String category ;

    public MenuItem(int id,String name, double price ,String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    @Override
    public String toString() {
        return category + " - " +id + ":" +name + " ($" + price + ")";
    }
}
