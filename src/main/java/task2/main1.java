package task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main1 {
    public static void main(String[] args) {
        Users[] users = new Users[10];
        Stuff[] stuff = new Stuff[10];
        Orders[] orders = new Orders[10];

        users = new Users[]{
                new Users("Иван", "Иванов", 123),
                new Users("Петр", "Петров", 124),
                new Users("Анна", "Сидорова", 1235)
        };
        stuff = new Stuff[]{
                new Stuff("Телефон", 50000, 1),
                new Stuff("Hоутбук", 100000,1),
                new Stuff("Планшет", 30000,2)
        };
        try {
            orders[0] = makePurchase(users[0], stuff[0], 3);
            orders[1] = makePurchase(users[1], stuff[1], 2);
            orders[2] = makePurchase(users[2], stuff[2], 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Количество совершенных покупок: " + Arrays.stream(orders).filter(order -> order != null).count());

    }


    private static Orders makePurchase(Users buyer, Stuff product, int quantity) throws Exception {
        if (buyer == null) {
            throw new Exception("Покупатель не существует");
        }
        if (product == null) {
            throw new Exception("Товар не существует");
            if (quantity <= 0) {
                throw new Exception("Количество должно быть положительным");
            }
            if (product.getQuantity() < quantity) { throw new Exception("Недостаточное количество товара");
            }
            product.setQuantity (product.getQuantity() - quantity);
            Orders order = new Orders (buyer, product, quantity);
            System.out.println("Coвepшена покупка:" + buyer.getName() + " " + buyer.getSurname() + " (" + buyer.phoneNumber + ") -" +
                    product.nameOfStuff + " (Цена: " + product.getPrice() + ", Количество: " + quantity + ")");
            return order;
        }
    }
}
