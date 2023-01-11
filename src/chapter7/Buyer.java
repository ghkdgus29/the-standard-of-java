package chapter7;

public class Buyer {

    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);
    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] tmp = new Product[cart.length * 2];
            for (int i = 0; i < cart.length; i++) {
                tmp[i] = cart[i];
            }
            cart = tmp;
        }
        cart[i++] = p;
    }

    void summary() {
        System.out.print("구입한 물건: ");
        int sum = 0;
        for (Product product : cart) {
            System.out.print(product + ",");
            sum += product.price;
        }
        System.out.println();
        System.out.println("사용한 금액: " + sum);
        System.out.println("남은 금액: " + money);
    }
}
