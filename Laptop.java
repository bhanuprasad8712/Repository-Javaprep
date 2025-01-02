public class Laptop {
    String brand;
    int price;
    String color;
Laptop(String brand,int price,String color){
    this.brand=brand;
    this.price=price;
    this.color=color;
}
public void laptopDetails(){
    System.out.println("brand "+brand);
    System.out.println("price "+price);
    System.out.println("color "+color);
}
}
