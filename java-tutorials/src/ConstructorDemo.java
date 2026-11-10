class StudentDetails{
    String name;
    int age;

    StudentDetails(){
        System.out.println("Default Constructor");
    }

    StudentDetails(String name,int age){
        this();
        this.name=name;
        this.age=age;
    }

    void display(){

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}



public class ConstructorDemo {
    public static void main(String[] args) {
      StudentDetails student =  new StudentDetails("Karthik", 16);
      student.display();


    }
}
