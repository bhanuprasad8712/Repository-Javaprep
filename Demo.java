public class Demo {
    int c=12;
 Demo(){
 }
 public void case1(){
    System.out.println("non static case");
}
 public static void main(String[] args) {
    Demo d1=new Demo();
    d1.case1();
    System.out.println(d1.c);
 }
}