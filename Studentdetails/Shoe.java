public class Shoe{
 String brand;
 int price;
 String color;
 double size;
 Shoe(String brand){
  this.brand=brand;
 }
 Shoe(String brand,int price){
   this(brand);
   this.price=price;
 }
 Shoe(String brand,int price,String color){
    this(brand,price);
    this.color=color;
 }
 Shoe(String brand,int price,String color,double size){
    this(brand,price,color);
    this.size=size;
 }
 public void shoeDetails(){
    System.out.println(brand+"brand");
    System.out.println(price+"price");
    System.out.println(color+"color");
    System.out.println(size+"size");
 }
}