class Camera{
    private String brand;
    private double cost;
 
    public Camera(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }
 
 }
 
 class DigitalCamera extends Camera{
    private int memory;
    public DigitalCamera(String brand, double cost, int memory) {
        super(brand, cost);
        this.memory = memory;
        System.out.println("The brand is: "+brand);
        System.out.println("The cost is: "+cost+"$");
        System.out.println("The memory is: "+memory+"GB");
    }
 }
 
 
 public class lab_eg_24 {
    public static void main(String[] args) {
        DigitalCamera digitalCamera = new DigitalCamera("Nikon",100,16);
    }
 }
 