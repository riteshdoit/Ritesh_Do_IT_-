class Order1{
    private int orderId;
    private String orderedFoods;
    private double totalPrice;
    private String status;
 
    public Order1(int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
    }
 
    public int getOrderId() {
        return orderId;
    }
 
    public String getOrderedFoods() {
        return orderedFoods;
    }
 
    double calculateTotalPrice(int unitPrice){
        totalPrice = (unitPrice+(0.05*unitPrice));
        return totalPrice;
    }
    static {
        System.out.println("Order Status: Ordered");
    }
 }
 
 public class lab_eg_20 {
    public static void main(String[] args) {
        System.out.println("Order Details");
        Order1 order1=new Order1(101,"Burger");
        System.out.println("Order ID:" + order1.getOrderId());
        System.out.println("Ordered Food: "+order1.getOrderedFoods());
        System.out.println("Total Price "+order1.calculateTotalPrice(33));
 
    }
 }
 