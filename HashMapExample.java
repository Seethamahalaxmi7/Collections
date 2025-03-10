import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // ✅ Create a HashMap with Student ID (Integer) and Name (String)
        HashMap<Integer, String> studentMap = new HashMap<>();

        // ✅ Add at least 10 key-value pairs
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Emma");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        // ✅ Insert a Key-Value mapping
        studentMap.put(111, "Kevin");
        System.out.println("After adding Kevin: " + studentMap);

        // ✅ Fetch the value of a Key
        System.out.println("\nStudent with ID 105: " + studentMap.get(105));

        // ✅ Create a clone/copy of HashMap
        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);
        System.out.println("\nCloned Map: " + clonedMap);

        // ✅ Check if a Key is in the Map
        System.out.println("\nIs ID 103 present? " + studentMap.containsKey(103));

        // ✅ Check if a Value is in the Map
        System.out.println("\nIs 'Emma' present? " + studentMap.containsValue("Emma"));

        // ✅ Check if the Map is empty
        System.out.println("\nIs the student map empty? " + studentMap.isEmpty());

        // ✅ Print the size of the Map
        System.out.println("\nSize of the HashMap: " + studentMap.size());

        // ✅ Print all the Keys of the Map
        System.out.println("\nAll Keys: " + studentMap.keySet());

        // ✅ Print all the Values of the Map
        System.out.println("\nAll Values: " + studentMap.values());

        // ✅ Remove a specific Key-Value pair
        studentMap.remove(108);
        System.out.println("\nAfter removing ID 108: " + studentMap);

        // ✅ Copy all elements to another Map
        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(studentMap);
        System.out.println("\nNew Copied Map: " + anotherMap);
    }
}
