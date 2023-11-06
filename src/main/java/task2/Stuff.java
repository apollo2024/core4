package task2;

public class Stuff {
    String nameOfStuff;
    Integer price;
    Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Stuff(Integer quantity) {

    }

    public String getNameOfStuff() {
        return nameOfStuff;
    }

    public void setNameOfStuff(String nameOfStuff) {
        this.nameOfStuff = nameOfStuff;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Stuff() {
    }

    public Stuff(String nameOfStuff, Integer price, Integer quantity) {
        this.nameOfStuff = nameOfStuff;
        this.price = price;
        this.quantity = quantity;
    }
}
