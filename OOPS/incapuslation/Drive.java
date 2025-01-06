package OOPS.incapuslation;

public class Drive {
   public static void main(String[] args) {
    Employe employe=new Employe();
    employe.setName("rahul");
    employe.setAge(21);
    employe.setID(101);
    employe.setSal(10000);
    System.out.println(employe.getAge());
    System.out.println(employe.getName());
   } 
}
