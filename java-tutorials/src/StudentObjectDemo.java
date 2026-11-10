public class StudentObjectDemo{
    int id;
    String name;
    String city;

    StudentObjectDemo(int id, String name, String city)
    {
        this.id=id;
        this.name=name;
        this.city=city;
    }

     void display()
     {
         System.out.println("id :" + id +" "+"name :" +name+" " +"city :"+city);
     }
     public static void main(String []args)
     {
         StudentObjectDemo student = new StudentObjectDemo(12,"Dhanush","Guntur");
         student.display();
     }
}
