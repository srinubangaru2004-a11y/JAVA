import java.util.TreeMap;
import java.util.Map;

public class TreeMapCRUD {

    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<Integer, String> students = new TreeMap<>();

        // ---------------- CREATE ----------------
        students.put(1, "Neelima");
        students.put(2, "Rahul");
        students.put(3, "Anjali");

        System.out.println("After Create Operation:");
        System.out.println(students);

        // ---------------- READ ----------------
        System.out.println("\nRead Operation:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }

        // ---------------- UPDATE ----------------
        students.put(2, "Rahul Kumar");   // updating value of key 2

        System.out.println("\nAfter Update Operation:");
        System.out.println(students);

        // ---------------- DELETE ----------------
        students.remove(3);

        System.out.println("\nAfter Delete Operation:");
        System.out.println(students);
    }
}