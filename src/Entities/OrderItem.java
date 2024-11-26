package Entities;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;


    public OrderItem() {}

    public OrderItem(int quantity, double price, Product product) {
        super();
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal(){
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
//        getProduct().getName();
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $ "
                + String.format("%.2f", subTotal()
        );
    }
}
