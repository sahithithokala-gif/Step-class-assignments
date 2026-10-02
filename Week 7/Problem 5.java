public class Cart {
    private final String cartId;
    private final int[] itemPrices;
    private int count;

    public Cart(String cartId, int capacity) {
        this.cartId = cartId;
        this.itemPrices = new int[capacity];
        this.count = 0;
    }

    public String getCartId() {
        return cartId;
    }

    public void addItem(int price) {
        if (count < itemPrices.length) {
            itemPrices[count++] = price;
        }
    }

    public int getItemCount() {
        return count;
    }

    public int getTotal() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += itemPrices[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Total: " + cart.getTotal());         // 500
        System.out.println("Item Count: " + cart.getItemCount()); // 3
    }
}