import java.util.ArrayList;

public class arraylist {
    public static void main(String args[]){
        ArrayList<String> students = new ArrayList<>();
        students.add("Shubham : ");
        students.add("Rahul");
        students.add("Rohit");
        students.add("Raj");
        students.add("Ravi");
        students.add("Rahul");
        students.add(2 , "Sania");
        System.out.println(students);

        students.remove(1);
        System.out.println(students);

        students.remove(String.valueOf("Raj"));
        System.out.println(students);
        students.set(2, "I");
        System.out.println(students);
        students.set(3,"Love");
        System.out.println(students);
        students.set(4,"You");

        System.out.println(students);
        System.out.println(students.contains("Sania"));
    }
}
