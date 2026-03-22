import java.util.HashSet;
import java.util.Iterator;

public class HashSetCRUD {
    public static void main(String[] args) {

        // CREATE
        HashSet<String> students = new HashSet<>();

        students.add("Neelima");
        students.add("Rahul");
        students.add("Anjali");

        System.out.println("After Create Operation:");
        System.out.println(students);

        // READ
        System.out.println("\nRead Operation:");
        Iterator<String> it = students.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // UPDATE
        // HashSet does not support direct update
        // So remove old value and add new value
        students.remove("Rahul");
        students.add("Rahul Kumar");

        System.out.println("\nAfter Update Operation:");
        System.out.println(students);

        // DELETE
        students.remove("Anjali");

        System.out.println("\nAfter Delete Operation:");
        System.out.println(students);
    }
}