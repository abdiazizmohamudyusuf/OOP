package tr.maltepe.edu.OOP;

public class Main {

    public static void main(String[] args) {

    Professor p1=new Professor();
    p1.setName("Ensar Hoca");
    p1.setPro_id(2020);
        System.out.println("name of the Professor: "+p1.getName());
        System.out.println("Professor id: "+p1.getPro_id());

    Student s1= new Student();
    s1.setName("Abdiaziz");
    s1.setStu_id(2050);
        System.out.println("Name of the student: "+s1.getName());
        System.out.println("Student id: "+s1.getStu_id());
    }
}
