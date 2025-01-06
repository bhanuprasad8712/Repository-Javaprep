//usig constrcutors
public class Student{
 String name;
 int age;
 int id;
 Student(String name,int age,int id){
    this.name=name;
    this.age=age;
    this.id=id;
 }
 public void studentDetails(){
    System.out.println("name is "+name);
    System.out.println("age is"+age);
    System.out.println("id is"+id);
 } 
}
