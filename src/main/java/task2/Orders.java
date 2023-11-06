package task2;

public class Orders {
    Users taker;
    Stuff stuff;
    Integer quantity;

    public Orders() {
    }

    public Users getTaker() {
        return taker;
    }

    public void setTaker(Users taker) {
        this.taker = taker;
    }

    public Stuff getStuff() {
        return stuff;
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer price) {
        this.quantity = price;
    }

    public Orders(Users taker, Stuff stuff, Integer quantity) {
        this.taker = taker;
        this.stuff = stuff;
        this.quantity = quantity;
    }
}
