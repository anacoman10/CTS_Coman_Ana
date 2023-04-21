package proxy;

public class Main {
    public static void main(String[] args) {
        IRestaurant restaurant=new Restaurant(" La Fratii dei");
        restaurant.rezervaMasa(4);

        IRestaurant proxy=new Proxy(restaurant);
        proxy.rezervaMasa(3);
        System.out.println();
        proxy.rezervaMasa(5);
    }
}
